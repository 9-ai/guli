package com.guli.edu.controller.admin;

import com.guli.common.vo.ReturnResult;
import com.guli.edu.entity.Teacher;
import com.guli.edu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author AChi
 * @Date 2019/11/8 22:12
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/admin/edu/teacher")
public class TeacherAdminController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public List<Teacher> list(){
        return teacherService.list(null);
    }

    @DeleteMapping(value = "/{id}")
    public boolean deleteById(@PathVariable String id){
        return false;
    }

    @GetMapping("/{page}/{limit}")
    public ReturnResult pageList(@PathVariable int page,@PathVariable int limit){

        return null;
    }

}
