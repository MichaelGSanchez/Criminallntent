package com.bignerdranch.android.criminallntent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CrimeActivity extends SingleFragmentActivity {

  @Override
  protected Fragment createFragment(){
    return new CrimeListFragment();
  }
}
