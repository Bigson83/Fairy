package me.zane.fairy;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Zane on 2017/10/24.
 * Email: zanebot96@gmail.com
 */

public class MySharedPre {
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    private MySharedPre() {
        preferences = PreferenceManager.getDefaultSharedPreferences(App.getInstance());
        editor = preferences.edit();
    }

    private static final class SingletonHolder {
        private static final MySharedPre instance = new MySharedPre();
    }

    public static MySharedPre getInstance() {
        return SingletonHolder.instance;
    }

    public void putIpAddress(String ipAddress) {
        editor.putString("ipaddress", ipAddress);
        editor.commit();
    }

    public String getIpAddress(String defaultValue) {
        return preferences.getString("ipaddress", defaultValue);
    }

    public void putTimeLine(String timeLine) {
        editor.putString("timeline", timeLine);
        editor.commit();
    }

    public String getTimeLine(String defaultValue) {
        return preferences.getString("timeline", defaultValue);
    }
}
