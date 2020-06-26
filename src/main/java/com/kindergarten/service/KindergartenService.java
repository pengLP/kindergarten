package com.kindergarten.service;

import com.kindergarten.po.Kindergarten;

import javax.persistence.Id;
import java.util.List;

public interface KindergartenService {

    Kindergarten getKindergartenById(Kindergarten kindergarten);
    List<Kindergarten> getAllKindergarten();

}
