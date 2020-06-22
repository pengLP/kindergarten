package com.kindergarten.controller;

import com.kindergarten.po.User;
import com.kindergarten.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String index() {
        return "login";
    }

    @RequestMapping("/checkLogin")
    public String checkLogin() {

        return "index";
    }



    @RequestMapping("/toRegister")
    public String toRegister() {
        return "register";
    }

    public static boolean isEffectiveDate(Date nowTime, Date startTime, Date endTime) {
        if (nowTime.getTime() != startTime.getTime() && nowTime.getTime() != endTime.getTime()) {
            Calendar date = Calendar.getInstance();
            date.setTime(nowTime);
            Calendar begin = Calendar.getInstance();
            begin.setTime(startTime);
            Calendar end = Calendar.getInstance();
            end.setTime(endTime);
            return date.after(begin) && date.before(end);
        } else {
            return true;
        }
    }

    @RequestMapping("/register")
    public String register(@RequestParam("files") MultipartFile[] files, User user, HttpServletRequest request, Model model) {

        String year = user.getCardNum().substring(6, 10);
        String month = user.getCardNum().substring(10, 12);
        String day = user.getCardNum().substring(12, 14);
        String birthday = year + "-" + month + "-" + day;
        DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;

        try {
            date = fmt.parse(birthday);
            System.out.println(date);
            if (isEffectiveDate(date, fmt.parse("2015-09-01"), fmt.parse("2016-08-31"))) {
                user.setType("小班");
            } else {
                if (!isEffectiveDate(date, fmt.parse("2016-09-01"), fmt.parse("2017-02-28"))) {
                    user.setType("拒收");
                    model.addAttribute("msg", "对不起，年龄不到无法报名。感谢您对南岗区第二幼儿园的支持！相关详细信息，请关注我园公众微信平台！");
                    return "error";
                }

                user.setType("托班");
            }
        } catch (ParseException var15) {
            var15.printStackTrace();
        }


        List<String> names = new ArrayList();
        String p = "";
        String realPath;
        String fileName;
        if (files != null && files.length > 0) {
            for(int i = 0; i < files.length; ++i) {
                MultipartFile file = files[i];
                realPath = "D://java//k-pic//";
                fileName = System.currentTimeMillis() + file.getOriginalFilename();
                String filePath = realPath + "\\img\\" +user.getCardNum() + user.getkName() + "\\"+ fileName;
                p = filePath;
                names.add(fileName);
                try {
                    File f = new File(filePath);
                    if (!f.getParentFile().exists())
                        f.getParentFile().mkdirs();
                    file.transferTo(new File(filePath));
                } catch (IOException var16) {
                    var16.printStackTrace();
                }
            }
        }

        user.setStatus("未报名");
        user.setPassword(user.getCardNum().substring(user.getCardNum().length() - 6, user.getCardNum().length()));
        user.setCardZPic((String)names.get(0));
        user.setCardFPic((String)names.get(1));
        user.setHksyPic((String)names.get(2));
        user.setHkhzPic((String)names.get(3));
        user.setHketbryPic((String)names.get(4));
        user.setEtyfjzz((String)names.get(5));
        user.setFczPic((String)names.get(6));
        user.setRegtime(new Date());
        model.addAttribute("path", p);
        userService.addUser(user);
        return "login";
    }

}
