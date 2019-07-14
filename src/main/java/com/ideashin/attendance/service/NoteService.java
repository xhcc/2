package com.ideashin.attendance.service;

import com.ideashin.attendance.entity.Note;

import java.util.Date;
import java.util.List;

/**
 * @Author: Shin
 * @Date: 2019/7/12 18:45
 * @Blog: ideashin.com
 */
public interface NoteService {

    /**
     * 增加
     * @param note
     */
    Boolean addOne(Note note);

    /**
     * 更新
     * @param note
     */
    Boolean editOne(Note note);

    /**
     * 查询所有
     */
    List findAllNotes();

    /**
     * 条件查询
     * @param noteTypeSearch
     * @param deptSelect
     * @param empSearch
     * @param dateSearch
     * @return
     */
    List findSomeNotes(int noteTypeSearch, String deptSelect, String empSearch, Date dateSearch);

    /**
     * 删除单条
     * @param noteID
     * @return
     */
    Boolean removeOneNote(int noteID);
}