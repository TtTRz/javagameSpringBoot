package com.rom.javagame.modules.prize.service.impl;

import com.rom.javagame.modules.prize.dao.PrizeDao;
import com.rom.javagame.modules.prize.entity.PrizeEntity;
import com.rom.javagame.modules.prize.service.PrizeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrizeServiceImpl implements PrizeService{
    @Autowired
    private PrizeDao prizeDao;

    //新增奖品
    @Override
    public boolean addPrize(PrizeEntity prizeEntity) {
        boolean flag = false;
        try {
            prizeDao.addPrize(prizeEntity);
            flag = true;
        } catch(Exception e ){
            e.printStackTrace();
        }
        return flag;
    }

    //更新奖品
    @Override
    public boolean updatePrize(PrizeEntity prizeEntity){
        boolean flag = false;
        try {
            flag = prizeDao.updatePrize(prizeEntity);
        } catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    //删除奖品
    @Override
    public boolean delPrize(int id) {
        boolean flag = false;
        try {
            flag = prizeDao.delPrize(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    //根据活动id返回奖品列表
    public List<PrizeEntity> findPrizesByAct(int id) {
        return prizeDao.findPrizesByActId(id);
    }

    //奖品数量-1
    public boolean reducePrize(int id) {
        return prizeDao.reducePrize(id);
    }
}
