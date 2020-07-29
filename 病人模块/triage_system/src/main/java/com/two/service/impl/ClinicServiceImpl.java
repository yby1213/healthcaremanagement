package com.two.service.impl;

import com.two.dao.ClinicMapper;
import com.two.entity.Clinic;
import com.two.service.ClinicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("clinicService")
public class ClinicServiceImpl implements ClinicService {

    @Resource
    private ClinicMapper clinicMapper;


}
