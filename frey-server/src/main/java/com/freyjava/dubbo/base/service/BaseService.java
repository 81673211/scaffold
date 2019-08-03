package com.freyjava.dubbo.base.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.freyjava.dubbo.base.entity.BaseEntity;

import java.util.List;

public interface BaseService<E extends BaseEntity> {
    /**
     * <b>Description:</b>��ȡ��ϸ��Ϣ<br>
     *
     * @param id not null
     * @return e
     */
    E get(Long id);

    /**
     * <b>Description:</b>��ҳ��ѯ��Ϣ<br>
     *
     * @param queryWrapper not null
     * @param page
     * @return pageModel
     */
    IPage<E> query(QueryWrapper<E> queryWrapper, Page<E> page);

    /**
     * <b>Description:</b>��ѯ��Ϣ<br>
     *
     * @param queryWrapper ��ѯ����
     * @return tList
     */
    List<E> query(QueryWrapper<E> queryWrapper);

    /**
     * <b>Description:</b>�����Ϣ<br>
     *
     * @param e not null
     * @return e
     */
    int create(E e);

    /**
     * <b>Description:</b>�޸���Ϣ<br>
     *
     * @param e not null
     */
    void update(E e, UpdateWrapper<E> updateWrapper);

}
