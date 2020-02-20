package com.perfect.mall.mallsys.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.perfect.mall.mallgeneric.utils.ThreadParam;
import com.perfect.mall.mallsys.entity.Verifycode;
import com.perfect.mall.mallsys.mapper.VerifycodeMapper;
import com.perfect.mall.mallsys.service.VerifycodeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Slf4j
@Service
public class VerifycodeServiceImpl implements VerifycodeService {

    @Autowired
    private VerifycodeMapper verifycodeMapper;

    @Override
    @Transactional
    public void add(Verifycode entity) {
        StringBuffer sb = new StringBuffer();
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            sb.append(r.nextInt(10));
        }
        Calendar c = Calendar.getInstance();
        entity.setCreateTime(c.getTime());
        c.add(Calendar.MINUTE, 10);
        entity.setExpireTime(c.getTime());
        entity.setCodeNumber(sb.toString());
        verifycodeMapper.add(entity);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        verifycodeMapper.delete(id);
    }

    @Override
    @Transactional
    public void update(Verifycode entity) {
        verifycodeMapper.update(entity);
    }

    @Override
    public Verifycode queryById(Long id) {
        return verifycodeMapper.queryById(id);
    }

    @Override
    public List<Verifycode> listByCodeTypeAndReceiver(Integer codeType, String receiver) {
        log.debug(ThreadParam.logMsg("codeType=" + codeType + ";receiver=" + receiver));
        return verifycodeMapper.listByCodeTypeAndReceiver(codeType, receiver);
    }

    @Override
    public PageInfo<Map<String, Object>> pgByReceiver(int pageNum, int pageSize, String receiver) {
        PageHelper.startPage(pageNum, pageSize);
        List<Map<String, Object>> arr = verifycodeMapper.pgByReceiver(receiver);
        return new PageInfo<Map<String, Object>>(arr);
    }

}
