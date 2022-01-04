// Generated by data binding compiler. Do not edit!
package org.monora.uprotocol.client.android.databinding;

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
import java.lang.Deprecated;
import java.lang.Object;
import org.monora.uprotocol.client.android.R;
import org.monora.uprotocol.client.android.fragment.FilePickerFragment;
import org.monora.uprotocol.client.android.viewmodel.content.FileContentViewModel;

public abstract class ListFilePickerBinding extends ViewDataBinding {
  @NonNull
  public final ImageView icon;

  @NonNull
  public final TextView secondaryText;

  @NonNull
  public final ImageView selectButton;

  @NonNull
  public final ImageView thumbnail;

  @NonNull
  public final TextView title;

  @Bindable
  protected FileContentViewModel mViewModel;

  @Bindable
  protected FilePickerFragment.SelectionType mSelectionType;

  protected ListFilePickerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView icon, TextView secondaryText, ImageView selectButton, ImageView thumbnail,
      TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.icon = icon;
    this.secondaryText = secondaryText;
    this.selectButton = selectButton;
    this.thumbnail = thumbnail;
    this.title = title;
  }

  public abstract void setViewModel(@Nullable FileContentViewModel viewModel);

  @Nullable
  public FileContentViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setSelectionType(@Nullable FilePickerFragment.SelectionType selectionType);

  @Nullable
  public FilePickerFragment.SelectionType getSelectionType() {
    return mSelectionType;
  }

  @NonNull
  public static ListFilePickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_file_picker, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListFilePickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListFilePickerBinding>inflateInternal(inflater, R.layout.list_file_picker, root, attachToRoot, component);
  }

  @NonNull
  public static ListFilePickerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_file_picker, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListFilePickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListFilePickerBinding>inflateInternal(inflater, R.layout.list_file_picker, null, false, component);
  }

  public static ListFilePickerBinding bind(@NonNull View view) {
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
  public static ListFilePickerBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListFilePickerBinding)bind(component, view, R.layout.list_file_picker);
  }
}