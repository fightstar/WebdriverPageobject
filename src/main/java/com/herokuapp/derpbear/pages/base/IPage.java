package com.herokuapp.derpbear.pages.base;

/**
 * Created by Vlad on 09.03.14.
 */
public interface IPage {
    public String getTitle();
    public IPage open();
    public IPage close();

}
