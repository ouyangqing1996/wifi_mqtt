package com.zhupp.ems.controller;
import com.zhupp.ems.util.OptResult;
import com.zhupp.ems.util.StringUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Qing OuYang 2019/05/21
 * 本接口提供给前端调用，来控制每一个传感器的状态(开/关)
 * 每一个方法对应一个传感器的控制，操作成功返回1，失败返回0，以Json格式返回
 */
@Api
@RestController
@RequestMapping("/control")
public class SensorController {

    /**
     * @param action 操作码，1代表打开操作，0代表关闭操作，其余值无效
     */
    OptResult opt = new OptResult();

    @ApiOperation("控制第一个传感器开关")
    @PostMapping("sensor1")
    public OptResult Sensor1(String action){
        if(StringUtils.isEmptyOrNull(action)){
            opt.setMsg("操作参数不可为空!");
            opt.setResult("0");
            return opt;
        }
        if(action.equals("1")){
            //TODO  //打开传感器
            opt.setResult("1");
            opt.setMsg("操作成功");
            return opt;
        }else if(action.equals("0")){
            //TODO  //关闭传感器
            opt.setResult("1");
            opt.setMsg("操作成功");
            return opt;
        }else{
            opt.setResult("0");
            opt.setMsg("操作码只可为0或1！");
            return opt;
        }
    }
}
