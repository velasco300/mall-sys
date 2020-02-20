package com.perfect.mall.mallsys.mapper;

import com.perfect.mall.mallsys.entity.Verifycode;

import java.util.List;
import java.util.Map;

public interface VerifycodeMapper {

    public void add(Verifycode entity);

    public void delete(Long id);

    public void update(Verifycode entity);

    public Verifycode queryById(Long id);

    public List<Verifycode> listByCodeTypeAndReceiver(Integer codeType, String receiver);

    public List<Map<String, Object>> pgByReceiver(String receiver);

}
