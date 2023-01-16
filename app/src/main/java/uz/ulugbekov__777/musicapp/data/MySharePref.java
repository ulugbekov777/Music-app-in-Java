package uz.ulugbekov__777.musicapp.data;

import android.content.Context;
import android.content.SharedPreferences;

import uz.ulugbekov__777.musicapp.utils.Constants;

public class MySharePref {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public void getInstance(Context context) {
        sharedPreferences = context.getSharedPreferences(Constants.PREFERENCE_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void setIsLogin(Boolean isLogin) {
        editor.putBoolean(Constants.IS_LOGIN, isLogin).apply();
    }

    public Boolean getIsLogin() {
        return sharedPreferences.getBoolean(Constants.IS_LOGIN, false);
    }
}
