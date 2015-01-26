package com.atfreaks.gamerzwiki.cores;

/**
 * Created by emil on 1/26/15.
 */
public abstract class NavigationDrawerItem {
    private String mTitle;
    private String mIconText;

    public NavigationDrawerItem(String title, String iconText) {
        mTitle = title;
        mIconText = iconText;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getIConText() {
        return mIconText;
    }

    public void setIconText(String iconText) {
        mIconText = iconText;
    }

    public abstract void onClick();
}
