package com.zhupp.ems.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DeviceListDto implements Serializable {
    /**
     * 设备列表
     */
   private  List<DeviceDto> list;
}
