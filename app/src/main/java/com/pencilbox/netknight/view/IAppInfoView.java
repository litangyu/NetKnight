package com.pencilbox.netknight.view;

import android.widget.BaseAdapter;

/**
 * Created by pencil-box on 16/6/29.
 * 应用信息列表
 */
public interface IAppInfoView  {

    //初始化数据的回调
    void onLoadAppInfoList(BaseAdapter adapter);

    //添加,删除,修改后的,list回调,数据的更新在adapter里操作就可以
    void onListRefresh(String msg);

    /**
     * 错误信息回调
     * @param optionId
     * @param msg
     */
    void onOptionFailed(int optionId,String msg);



}
