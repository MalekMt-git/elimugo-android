// Generated by data binding compiler. Do not edit!
package org.monora.uprotocol.client.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.Deprecated;
import java.lang.Object;
import org.monora.uprotocol.client.android.R;
import org.monora.uprotocol.client.android.fragment.content.VideoBucketContentViewModel;

public abstract class ListVideoBucketBinding extends ViewDataBinding {
  @NonNull
  public final ShapeableImageView image;

  @NonNull
  public final TextView title;

  @Bindable
  protected VideoBucketContentViewModel mViewModel;

  protected ListVideoBucketBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ShapeableImageView image, TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.image = image;
    this.title = title;
  }

  public abstract void setViewModel(@Nullable VideoBucketContentViewModel viewModel);

  @Nullable
  public VideoBucketContentViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ListVideoBucketBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_video_bucket, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListVideoBucketBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListVideoBucketBinding>inflateInternal(inflater, R.layout.list_video_bucket, root, attachToRoot, component);
  }

  @NonNull
  public static ListVideoBucketBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_video_bucket, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListVideoBucketBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListVideoBucketBinding>inflateInternal(inflater, R.layout.list_video_bucket, null, false, component);
  }

  public static ListVideoBucketBinding bind(@NonNull View view) {
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
  public static ListVideoBucketBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListVideoBucketBinding)bind(component, view, R.layout.list_video_bucket);
  }
}