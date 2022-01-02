package org.monora.uprotocol.client.android.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001:B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020,H\u0016J\u0012\u0010.\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J\u0012\u00105\u001a\u00020,2\b\u00106\u001a\u0004\u0018\u000107H\u0014J\u0012\u00108\u001a\u00020,2\b\b\u0001\u00109\u001a\u00020\u001fH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010 \u001a\n \"*\u0004\u0018\u00010!0!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\t\u001a\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020\'8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\t\u001a\u0004\b(\u0010)\u00a8\u0006;"}, d2 = {"Lorg/monora/uprotocol/client/android/activity/HomeActivity;", "Lorg/monora/uprotocol/client/android/app/Activity;", "Lcom/google/android/material/navigation/NavigationView$OnNavigationItemSelectedListener;", "()V", "changelogViewModel", "Lorg/monora/uprotocol/client/android/viewmodel/ChangelogViewModel;", "getChangelogViewModel", "()Lorg/monora/uprotocol/client/android/viewmodel/ChangelogViewModel;", "changelogViewModel$delegate", "Lkotlin/Lazy;", "crashLogViewModel", "Lorg/monora/uprotocol/client/android/viewmodel/CrashLogViewModel;", "getCrashLogViewModel", "()Lorg/monora/uprotocol/client/android/viewmodel/CrashLogViewModel;", "crashLogViewModel$delegate", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "getDrawerLayout", "()Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout$delegate", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "navController$delegate", "navigationView", "Lcom/google/android/material/navigation/NavigationView;", "getNavigationView", "()Lcom/google/android/material/navigation/NavigationView;", "navigationView$delegate", "pendingMenuItemId", "", "userProfileBinding", "Lorg/monora/uprotocol/client/android/databinding/LayoutUserProfileBinding;", "kotlin.jvm.PlatformType", "getUserProfileBinding", "()Lorg/monora/uprotocol/client/android/databinding/LayoutUserProfileBinding;", "userProfileBinding$delegate", "userProfileViewModel", "Lorg/monora/uprotocol/client/android/viewmodel/UserProfileViewModel;", "getUserProfileViewModel", "()Lorg/monora/uprotocol/client/android/viewmodel/UserProfileViewModel;", "userProfileViewModel$delegate", "applyAwaitingDrawerAction", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNavigationItemSelected", "", "item", "Landroid/view/MenuItem;", "onNewIntent", "intent", "Landroid/content/Intent;", "openItem", "id", "Companion", "hotspot-ui_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeActivity extends org.monora.uprotocol.client.android.app.Activity implements com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener {
    private final kotlin.Lazy changelogViewModel$delegate = null;
    private final kotlin.Lazy crashLogViewModel$delegate = null;
    private final kotlin.Lazy userProfileViewModel$delegate = null;
    private final kotlin.Lazy userProfileBinding$delegate = null;
    private final kotlin.Lazy navigationView$delegate = null;
    private final kotlin.Lazy drawerLayout$delegate = null;
    private int pendingMenuItemId = 0;
    private final kotlin.Lazy navController$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.activity.HomeActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_OPEN_TRANSFER_DETAILS = "org.monora.uprotocol.client.android.action.OPEN_TRANSFER_DETAILS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_OPEN_WEB_TRANSFER = "org.monora.uprotocol.client.android.action.OPEN_WEB_TRANSFER";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_OPEN_SHARED_TEXT = "org.monora.uprotocol.client.android.action.OPEN_SHARED_TEXT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_TRANSFER = "extraTransfer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_WEB_TRANSFER = "extraWebTransfer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SHARED_TEXT = "extraSharedText";
    
    public HomeActivity() {
        super();
    }
    
    private final org.monora.uprotocol.client.android.viewmodel.ChangelogViewModel getChangelogViewModel() {
        return null;
    }
    
    private final org.monora.uprotocol.client.android.viewmodel.CrashLogViewModel getCrashLogViewModel() {
        return null;
    }
    
    private final org.monora.uprotocol.client.android.viewmodel.UserProfileViewModel getUserProfileViewModel() {
        return null;
    }
    
    private final org.monora.uprotocol.client.android.databinding.LayoutUserProfileBinding getUserProfileBinding() {
        return null;
    }
    
    private final com.google.android.material.navigation.NavigationView getNavigationView() {
        return null;
    }
    
    private final androidx.drawerlayout.widget.DrawerLayout getDrawerLayout() {
        return null;
    }
    
    private final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void applyAwaitingDrawerAction() {
    }
    
    private final void openItem(@androidx.annotation.IdRes()
    int id) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lorg/monora/uprotocol/client/android/activity/HomeActivity$Companion;", "", "()V", "ACTION_OPEN_SHARED_TEXT", "", "ACTION_OPEN_TRANSFER_DETAILS", "ACTION_OPEN_WEB_TRANSFER", "EXTRA_SHARED_TEXT", "EXTRA_TRANSFER", "EXTRA_WEB_TRANSFER", "hotspot-ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}