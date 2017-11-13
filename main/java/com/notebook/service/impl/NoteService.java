package com.notebook.service.impl;


import com.notebook.dao.INoteDao;
import com.notebook.po.Note;
import com.notebook.service.INoteService;
import com.util.DateUtils;
import com.util.UuidUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by 潘文卓 on Mon Nov 13 17:11:00 CST 2017.
 */
@Service
public class NoteService implements INoteService {

    @Autowired
    INoteDao noteDao;

    @Override
    public void add(Note note) {
        note.setId(UuidUtil.getUuid());
        note.setDeleteState('0');
        noteDao.add(note);
    }

    @Override
    public void update(Note note) {
        note.setModifyTime(DateUtils.CURR_DATE_STR);
        note.setCreateTime(null);
        note.setDeleteState('0');
        noteDao.update(note);
    }

    @Override
    public void delete(String objId) {
        Note note = noteDao.getEntityById(objId);
        note.setDeleteState('1');
        noteDao.update(note);
    }

    @Override
    public Note get(String objId) {
       return noteDao.getEntityById(objId);
    }

    @Override
    public void save(Note note) {
        if(StringUtils.isEmpty(note.getId())){
            add(note);
        }else {
            update(note);
        }
    }



}
