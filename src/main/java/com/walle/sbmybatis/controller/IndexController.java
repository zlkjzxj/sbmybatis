package com.walle.sbmybatis.controller;


import com.walle.sbmybatis.bean.Girl;
import com.walle.sbmybatis.dao.GirlDao;
import com.walle.sbmybatis.utils.Result;
import com.walle.sbmybatis.utils.ResultUtil;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
public class IndexController {

    @Resource
    private GirlDao girlDao;

    /**
     * 查询女生列表
     *
     * @return
     */
    @GetMapping("/getGirls")
    public List<Girl> getAGirlList() {

        return girlDao.getGirlList();
    }


    /**
     * 查询一个女生
     *
     * @return
     */
    @GetMapping("/getAGirl/{id}")
    public Girl getAGirl(@PathVariable("id") int id) {
        return girlDao.selectGirlById(id);
    }

    /**
     * 保存一个女生
     *
     * @return
     */
    @PostMapping("insertAGirl")
    public Result<Girl> insertAGirl(@Valid Girl girl, BindingResult bindingResult) {//表单验证
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());

        } else {
            //事务返回的都是code代码，只能用int接收，需要其他参数自己封装
            int code = girlDao.insertAGirl(girl);
            return ResultUtil.success(girl, code);
        }
    }

    /**
     * 修改一个女生
     *
     * @return
     */
    @PostMapping("updateAGirl")
    public Result<Girl> updateAGirl(@Valid Girl girl, BindingResult bindingResult) {//表单验证
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        } else {
            //事务返回的都是code代码，只能用int接收，需要其他参数自己封装
            int code = girlDao.updateAGirl(girl);
            return ResultUtil.success(girl, code);
        }
    }
}
