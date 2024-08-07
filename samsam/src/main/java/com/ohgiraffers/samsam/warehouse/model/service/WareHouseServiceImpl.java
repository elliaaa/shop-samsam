package com.ohgiraffers.samsam.warehouse.model.service;

import com.ohgiraffers.samsam.warehouse.model.dao.WareHouseMapper;
import com.ohgiraffers.samsam.warehouse.model.dto.WareHouseDTO;
import com.ohgiraffers.samsam.warehouse.model.dto.WareHouseLogDTO;
import com.ohgiraffers.samsam.warehouse.model.dto.logDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class WareHouseServiceImpl implements WareHouseService{

    private final WareHouseMapper wareHouseMapper;

    public WareHouseServiceImpl(WareHouseMapper wareHouseMapper) {
        this.wareHouseMapper = wareHouseMapper;
    }

    @Override
    public List<WareHouseDTO> AllWareHouse(String WareHouse) {
        log.info("[WareHouseImpl] AllMenu menuName {}", WareHouse);
        return wareHouseMapper.AllWareHouse(WareHouse);
    }

    @Override
    public List<WareHouseLogDTO> AllWareHouseLog(String WareHouseLog) {
        log.info("[WareHouseLogImpl] AllMenu menuName {}", WareHouseLog);
        return wareHouseMapper.AllWareHouseLog(WareHouseLog);
    }
//
//    @Override
//    public boolean inAndOut(int orderSeq, int quantity) {
//        return wareHouseMapper.inAndOut(orderSeq, quantity);
//    }

    @Override
    public boolean isTrue(int orderSeq) {
        return wareHouseMapper.isTrue(orderSeq) > 0? true: false;
    }

    @Override
    public int quantityNum(int quantity) {
        return wareHouseMapper.quantityNum(quantity);
    }

    @Override
    public int changedQuantity(int orderSeq, int quantity) {
        return wareHouseMapper.changedQuantity(orderSeq, quantity);
    }

    @Override
    public int insertLog(int orderSeq, int status, int quantity) {
        return wareHouseMapper.insertLog(orderSeq, status, quantity);
    }


    @Override
    public List<logDTO> findlogs() {
        return wareHouseMapper.findlogs();
    }

    @Override
    public void updateLog(int productSeq, int quantity) {
        wareHouseMapper.updateLog(productSeq, quantity);
    }
}
