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
    List findAll(Integer page, Integer rows);

    /**
     * 条件查询
     * @param noteTypeSearch
     * @param deptSelect
     * @param empSearch
     * @param dateSearch
     * @return
     */
    List findSome(Integer noteTypeSearch, Integer deptSelect, String empSearch, Date dateSearch);

    /**
     * 删除单条
     * @param noteID
     * @return
     */
    Boolean removeOne(Integer noteID);

    /**
     * 查询用户对应的表单到今日考勤
     * @param employeeID
     * @param attendanceDate
     * @return
     */
    List findNoteToAttendance(Integer employeeID, Date attendanceDate);


    /**
     * 查询条数
     * @return
     */
    int getCount();
}
