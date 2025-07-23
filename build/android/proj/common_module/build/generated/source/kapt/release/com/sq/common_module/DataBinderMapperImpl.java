package com.sq.common_module;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sq.common_module.databinding.ActivityAboutUsBindingImpl;
import com.sq.common_module.databinding.ActivityBaseBindingImpl;
import com.sq.common_module.databinding.ActivityBaseWebBindingImpl;
import com.sq.common_module.databinding.ActivityBindWxBindingImpl;
import com.sq.common_module.databinding.ActivityCommonSettingBindingImpl;
import com.sq.common_module.databinding.ActivityDeleteAccountBindingImpl;
import com.sq.common_module.databinding.ActivitySplashBindingImpl;
import com.sq.common_module.databinding.ActivityWindowPermissionBindingImpl;
import com.sq.common_module.databinding.CommonToolbarBindingImpl;
import com.sq.common_module.databinding.DialogDeleteAccountBindingImpl;
import com.sq.common_module.databinding.DialogRealAuthBindingImpl;
import com.sq.common_module.databinding.DialogRewardLoading30016BindingImpl;
import com.sq.common_module.databinding.DialogRewardLoadingBindingImpl;
import com.sq.common_module.databinding.FragmentBackAppBindingImpl;
import com.sq.common_module.databinding.FragmentBaseBindingImpl;
import com.sq.common_module.databinding.FragmentPrivacyAgreement1BindingImpl;
import com.sq.common_module.databinding.FragmentPrivacyAgreementBindingImpl;
import com.sq.common_module.databinding.FragmentPrivacyAgreementFirstBindingImpl;
import com.sq.common_module.databinding.FragmentUpdateAppBindingImpl;
import com.sq.common_module.databinding.LayoutSplashAdBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYABOUTUS = 1;

  private static final int LAYOUT_ACTIVITYBASE = 2;

  private static final int LAYOUT_ACTIVITYBASEWEB = 3;

  private static final int LAYOUT_ACTIVITYBINDWX = 4;

  private static final int LAYOUT_ACTIVITYCOMMONSETTING = 5;

  private static final int LAYOUT_ACTIVITYDELETEACCOUNT = 6;

  private static final int LAYOUT_ACTIVITYSPLASH = 7;

  private static final int LAYOUT_ACTIVITYWINDOWPERMISSION = 8;

  private static final int LAYOUT_COMMONTOOLBAR = 9;

  private static final int LAYOUT_DIALOGDELETEACCOUNT = 10;

  private static final int LAYOUT_DIALOGREALAUTH = 11;

  private static final int LAYOUT_DIALOGREWARDLOADING = 12;

  private static final int LAYOUT_DIALOGREWARDLOADING30016 = 13;

  private static final int LAYOUT_FRAGMENTBACKAPP = 14;

  private static final int LAYOUT_FRAGMENTBASE = 15;

  private static final int LAYOUT_FRAGMENTPRIVACYAGREEMENT = 16;

  private static final int LAYOUT_FRAGMENTPRIVACYAGREEMENT1 = 17;

  private static final int LAYOUT_FRAGMENTPRIVACYAGREEMENTFIRST = 18;

  private static final int LAYOUT_FRAGMENTUPDATEAPP = 19;

  private static final int LAYOUT_LAYOUTSPLASHAD = 20;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(20);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sq.common_module.R.layout.activity_about_us, LAYOUT_ACTIVITYABOUTUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sq.common_module.R.layout.activity_base, LAYOUT_ACTIVITYBASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sq.common_module.R.layout.activity_base_web, LAYOUT_ACTIVITYBASEWEB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sq.common_module.R.layout.activity_bind_wx, LAYOUT_ACTIVITYBINDWX);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sq.common_module.R.layout.activity_common_setting, LAYOUT_ACTIVITYCOMMONSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sq.common_module.R.layout.activity_delete_account, LAYOUT_ACTIVITYDELETEACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sq.common_module.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sq.common_module.R.layout.activity_window_permission, LAYOUT_ACTIVITYWINDOWPERMISSION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sq.common_module.R.layout.common_toolbar, LAYOUT_COMMONTOOLBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sq.common_module.R.layout.dialog_delete_account, LAYOUT_DIALOGDELETEACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sq.common_module.R.layout.dialog_real_auth, LAYOUT_DIALOGREALAUTH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sq.common_module.R.layout.dialog_reward_loading, LAYOUT_DIALOGREWARDLOADING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sq.common_module.R.layout.dialog_reward_loading_30016, LAYOUT_DIALOGREWARDLOADING30016);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sq.common_module.R.layout.fragment_back_app, LAYOUT_FRAGMENTBACKAPP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sq.common_module.R.layout.fragment_base, LAYOUT_FRAGMENTBASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sq.common_module.R.layout.fragment_privacy_agreement, LAYOUT_FRAGMENTPRIVACYAGREEMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sq.common_module.R.layout.fragment_privacy_agreement1, LAYOUT_FRAGMENTPRIVACYAGREEMENT1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sq.common_module.R.layout.fragment_privacy_agreement_first, LAYOUT_FRAGMENTPRIVACYAGREEMENTFIRST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sq.common_module.R.layout.fragment_update_app, LAYOUT_FRAGMENTUPDATEAPP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sq.common_module.R.layout.layout_splash_ad, LAYOUT_LAYOUTSPLASHAD);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYABOUTUS: {
          if ("layout/activity_about_us_0".equals(tag)) {
            return new ActivityAboutUsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_about_us is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYBASE: {
          if ("layout/activity_base_0".equals(tag)) {
            return new ActivityBaseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_base is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYBASEWEB: {
          if ("layout/activity_base_web_0".equals(tag)) {
            return new ActivityBaseWebBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_base_web is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYBINDWX: {
          if ("layout/activity_bind_wx_0".equals(tag)) {
            return new ActivityBindWxBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_bind_wx is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCOMMONSETTING: {
          if ("layout/activity_common_setting_0".equals(tag)) {
            return new ActivityCommonSettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_common_setting is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDELETEACCOUNT: {
          if ("layout/activity_delete_account_0".equals(tag)) {
            return new ActivityDeleteAccountBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_delete_account is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYWINDOWPERMISSION: {
          if ("layout/activity_window_permission_0".equals(tag)) {
            return new ActivityWindowPermissionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_window_permission is invalid. Received: " + tag);
        }
        case  LAYOUT_COMMONTOOLBAR: {
          if ("layout/common_toolbar_0".equals(tag)) {
            return new CommonToolbarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for common_toolbar is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGDELETEACCOUNT: {
          if ("layout/dialog_delete_account_0".equals(tag)) {
            return new DialogDeleteAccountBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_delete_account is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGREALAUTH: {
          if ("layout/dialog_real_auth_0".equals(tag)) {
            return new DialogRealAuthBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_real_auth is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGREWARDLOADING: {
          if ("layout/dialog_reward_loading_0".equals(tag)) {
            return new DialogRewardLoadingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_reward_loading is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGREWARDLOADING30016: {
          if ("layout/dialog_reward_loading_30016_0".equals(tag)) {
            return new DialogRewardLoading30016BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_reward_loading_30016 is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBACKAPP: {
          if ("layout/fragment_back_app_0".equals(tag)) {
            return new FragmentBackAppBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_back_app is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBASE: {
          if ("layout/fragment_base_0".equals(tag)) {
            return new FragmentBaseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_base is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRIVACYAGREEMENT: {
          if ("layout/fragment_privacy_agreement_0".equals(tag)) {
            return new FragmentPrivacyAgreementBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_privacy_agreement is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRIVACYAGREEMENT1: {
          if ("layout/fragment_privacy_agreement1_0".equals(tag)) {
            return new FragmentPrivacyAgreement1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_privacy_agreement1 is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRIVACYAGREEMENTFIRST: {
          if ("layout/fragment_privacy_agreement_first_0".equals(tag)) {
            return new FragmentPrivacyAgreementFirstBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_privacy_agreement_first is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTUPDATEAPP: {
          if ("layout/fragment_update_app_0".equals(tag)) {
            return new FragmentUpdateAppBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_update_app is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTSPLASHAD: {
          if ("layout/layout_splash_ad_0".equals(tag)) {
            return new LayoutSplashAdBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_splash_ad is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.chad.library.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(20);

    static {
      sKeys.put("layout/activity_about_us_0", com.sq.common_module.R.layout.activity_about_us);
      sKeys.put("layout/activity_base_0", com.sq.common_module.R.layout.activity_base);
      sKeys.put("layout/activity_base_web_0", com.sq.common_module.R.layout.activity_base_web);
      sKeys.put("layout/activity_bind_wx_0", com.sq.common_module.R.layout.activity_bind_wx);
      sKeys.put("layout/activity_common_setting_0", com.sq.common_module.R.layout.activity_common_setting);
      sKeys.put("layout/activity_delete_account_0", com.sq.common_module.R.layout.activity_delete_account);
      sKeys.put("layout/activity_splash_0", com.sq.common_module.R.layout.activity_splash);
      sKeys.put("layout/activity_window_permission_0", com.sq.common_module.R.layout.activity_window_permission);
      sKeys.put("layout/common_toolbar_0", com.sq.common_module.R.layout.common_toolbar);
      sKeys.put("layout/dialog_delete_account_0", com.sq.common_module.R.layout.dialog_delete_account);
      sKeys.put("layout/dialog_real_auth_0", com.sq.common_module.R.layout.dialog_real_auth);
      sKeys.put("layout/dialog_reward_loading_0", com.sq.common_module.R.layout.dialog_reward_loading);
      sKeys.put("layout/dialog_reward_loading_30016_0", com.sq.common_module.R.layout.dialog_reward_loading_30016);
      sKeys.put("layout/fragment_back_app_0", com.sq.common_module.R.layout.fragment_back_app);
      sKeys.put("layout/fragment_base_0", com.sq.common_module.R.layout.fragment_base);
      sKeys.put("layout/fragment_privacy_agreement_0", com.sq.common_module.R.layout.fragment_privacy_agreement);
      sKeys.put("layout/fragment_privacy_agreement1_0", com.sq.common_module.R.layout.fragment_privacy_agreement1);
      sKeys.put("layout/fragment_privacy_agreement_first_0", com.sq.common_module.R.layout.fragment_privacy_agreement_first);
      sKeys.put("layout/fragment_update_app_0", com.sq.common_module.R.layout.fragment_update_app);
      sKeys.put("layout/layout_splash_ad_0", com.sq.common_module.R.layout.layout_splash_ad);
    }
  }
}
