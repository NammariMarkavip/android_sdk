package com.adjust.sdk;

import android.net.Uri;

/**
 * Created by pfms on 15/12/14.
 */
public interface IActivityHandler {
    public void init(AdjustConfig config);

    public void onResume();

    public void onPause();

    public void trackEvent(AdjustEvent event);

    public void finishedTrackingActivity(ResponseData responseData);

    public void setEnabled(boolean enabled);

    public boolean isEnabled();

    public void readOpenUrl(Uri url, long clickTime);

    public boolean updateAttribution(AdjustAttribution attribution);

    public void launchEventResponseTasks(EventResponseData eventResponseData);

    public void launchSessionResponseTasks(SessionResponseData sessionResponseData);

    public void launchAttributionResponseTasks(AttributionResponseData attributionResponseData);

    public void sendReferrer(String referrer, long clickTime);

    public void setOfflineMode(boolean enabled);

    public void setAskingAttribution(boolean askingAttribution);

    public ActivityPackage getAttributionPackage();
}
