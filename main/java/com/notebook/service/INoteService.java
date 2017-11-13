package com.notebook.service;


import com.notebook.po.Note;

/**
 * Created by 潘文卓 on Mon Nov 13 17:11:00 CST 2017
 */
public interface INoteService {

    /**
     * 新增
     * @param note 实体
     */
    void add(Note note);

    /**
     * 修改
     * @param note 实体
     */
    void update(Note note);

    /**
     * 删除
     * @param objId
     */
    void delete(String objId);

    /**
     * 通过主键 获取实体
     * @param objId 主键
     * @return 实体
     */
    Note get(String objId);

    /**
     *  保存 新增修改共用
     * @param note 实体
     */
    void save(Note note);

}
