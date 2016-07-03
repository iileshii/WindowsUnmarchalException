package com.icerockdev.icedroid.testutfbug;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Currency;

public class MainActivity extends AppCompatActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		ViewDataBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
		if (binding != null) binding.setVariable(0,"Test UTF");
	}
}
