package com.org.mtk_imei_app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AutoStartReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {

		Intent mainIntent=new Intent(context, MainActivity.class);
		mainIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);  //ע�⣬������������ǣ�����������ʧ�� 
		context.startActivity(mainIntent);  
	}

}
