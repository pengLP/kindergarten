package com.kindergarten.controller;

import com.kindergarten.po.Kindergarten;
import com.kindergarten.po.User;
import com.kindergarten.service.KindergartenService;
import com.kindergarten.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AdminController {


    @Autowired
    UserService userService;

    @Autowired
    KindergartenService kindergartenService;

    @RequestMapping("/adminIndex")
    public String index(Model model) {
        List<Kindergarten> kindergartens = kindergartenService.getAllKindergarten();
        model.addAttribute("kindergartens" , kindergartens);
        return "adminIndex";
    }

    @RequestMapping("adminUserList")
    public String userList(Kindergarten k,Model model) {
        Kindergarten kindergarten = kindergartenService.getKindergartenById(k);
        User user = new User();
        user.setkId(kindergarten.getId());
        List<User> userList = userService.getUser(user);
        model.addAttribute("kindergarten" , kindergarten);
        model.addAttribute("users", userList);
        return "adminTable";
    }

    @RequestMapping("updateKindergarZAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAzAAAAza")
    public String updateKindergarten(Kindergarten kindergarten) {
        Kindergarten ki = new Kindergarten();
        System.out.println("======");
        ki.setId(kindergarten.getId());
        Kindergarten k = kindergartenService.getKindergartenById(ki);
        k.setStatus(kindergarten.getStatus());
        kindergartenService.updateKindergarten(k);
        return "redirect:/adminUserList?id="+kindergarten.getId();
    }

    @RequestMapping("updateKinder")
    public String updateKinder(Kindergarten kindergarten) {
        Kindergarten ki = new Kindergarten();
        ki.setId(kindergarten.getId());
        System.out.println(ki);
        Kindergarten k = kindergartenService.getKindergartenById(ki);
        k.setBdTime(kindergarten.getBdTime());
        k.setAllNum(kindergarten.getAllNum());
        k.setDbNum(kindergarten.getDbNum());
        k.setXbNum(kindergarten.getXbNum());
        k.setStartTime(kindergarten.getStartTime());
        k.setTbNum(kindergarten.getTbNum());
        kindergartenService.updateKindergarten(k);
        return "redirect:/adminUserList?id="+kindergarten.getId();
    }

    @RequestMapping("userDetail")
    public String userDetail(User user , Model model) {
        User u = userService.getUserById(user);
        model.addAttribute("user", u);
        return "adminUserDetail";
    }
}
