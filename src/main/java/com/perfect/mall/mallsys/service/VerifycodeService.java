package com.perfect.mall.mallsys.service;

import com.github.pagehelper.PageInfo;
import com.perfect.mall.mallsys.entity.Verifycode;

import java.util.List;
import java.util.Map;

public interface VerifycodeService {

    public void add(Verifycode entity);

    public void delete(Long id);

    public void update(Verifycode entity);

    public Verifycode queryById(Long id);

    public List<Verifycode> listByCodeTypeAndReceiver(Integer codeType, String receiver);

    public PageInfo<Map<String, Object>> pgByReceiver(int pageNum, int pageSize, String receiver);

}
