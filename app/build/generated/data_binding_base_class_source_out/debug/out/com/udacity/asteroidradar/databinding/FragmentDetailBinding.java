// Generated by data binding compiler. Do not edit!
package com.udacity.asteroidradar.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.udacity.asteroidradar.R;
import com.udacity.asteroidradar.data.room.AsteroidEntity;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentDetailBinding extends ViewDataBinding {
  @NonNull
  public final TextView absoluteMagnitude;

  @NonNull
  public final ImageView activityMainImageOfTheDay;

  @NonNull
  public final TextView closeApproachDate;

  @NonNull
  public final TextView distanceFromEarth;

  @NonNull
  public final TextView estimatedDiameter;

  @NonNull
  public final ImageView helpButton;

  @NonNull
  public final TextView relativeVelocity;

  @Bindable
  protected AsteroidEntity mAsteroid;

  protected FragmentDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView absoluteMagnitude, ImageView activityMainImageOfTheDay, TextView closeApproachDate,
      TextView distanceFromEarth, TextView estimatedDiameter, ImageView helpButton,
      TextView relativeVelocity) {
    super(_bindingComponent, _root, _localFieldCount);
    this.absoluteMagnitude = absoluteMagnitude;
    this.activityMainImageOfTheDay = activityMainImageOfTheDay;
    this.closeApproachDate = closeApproachDate;
    this.distanceFromEarth = distanceFromEarth;
    this.estimatedDiameter = estimatedDiameter;
    this.helpButton = helpButton;
    this.relativeVelocity = relativeVelocity;
  }

  public abstract void setAsteroid(@Nullable AsteroidEntity asteroid);

  @Nullable
  public AsteroidEntity getAsteroid() {
    return mAsteroid;
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentDetailBinding>inflateInternal(inflater, R.layout.fragment_detail, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentDetailBinding>inflateInternal(inflater, R.layout.fragment_detail, null, false, component);
  }

  public static FragmentDetailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentDetailBinding)bind(component, view, R.layout.fragment_detail);
  }
}
