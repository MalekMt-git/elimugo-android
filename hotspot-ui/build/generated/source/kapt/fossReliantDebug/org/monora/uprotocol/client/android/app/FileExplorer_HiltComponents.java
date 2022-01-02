package org.monora.uprotocol.client.android.app;

import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewModelScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.inject.Singleton;
import org.monora.uprotocol.client.android.activity.ContentBrowserActivity_GeneratedInjector;
import org.monora.uprotocol.client.android.activity.HomeActivity_GeneratedInjector;
import org.monora.uprotocol.client.android.activity.IntroductionProfileFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.activity.PackageInstallerActivity_GeneratedInjector;
import org.monora.uprotocol.client.android.activity.SharingActivity_GeneratedInjector;
import org.monora.uprotocol.client.android.activity.WelcomeActivity_GeneratedInjector;
import org.monora.uprotocol.client.android.di.RoomModule;
import org.monora.uprotocol.client.android.di.SingletonUprotocolModule;
import org.monora.uprotocol.client.android.di.TransportSessionModule;
import org.monora.uprotocol.client.android.di.WebServerModule;
import org.monora.uprotocol.client.android.fragment.ChangelogFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.ClientDetailsFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.ContentBrowserFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.ContentBrowserViewModel_HiltModules;
import org.monora.uprotocol.client.android.fragment.CrashLogFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.FilePickerFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.LicensesFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.ManageClientsFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.NetworkManagerFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.PreparationViewModel_HiltModules;
import org.monora.uprotocol.client.android.fragment.PrepareSharingFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.ProfileEditorFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.ReceiveFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.ReceiverViewModel_HiltModules;
import org.monora.uprotocol.client.android.fragment.SharingFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.SharingSelectionsViewModel_HiltModules;
import org.monora.uprotocol.client.android.fragment.TextEditorFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.TextEditorViewModel_HiltModules;
import org.monora.uprotocol.client.android.fragment.TransferDetailsFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.TransferHistoryFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.TransferItemFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.WebTransferDetailsFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.content.AppBrowserFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.content.AppBrowserViewModel_HiltModules;
import org.monora.uprotocol.client.android.fragment.content.AudioBrowserFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.content.AudioBrowserViewModel_HiltModules;
import org.monora.uprotocol.client.android.fragment.content.FileBrowserFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.content.ImageBrowserFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.content.ImageBrowserViewModel_HiltModules;
import org.monora.uprotocol.client.android.fragment.content.SelectionsFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.content.VideoBrowserFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.content.VideoBrowserViewModel_HiltModules;
import org.monora.uprotocol.client.android.fragment.content.transfer.PrepareIndexFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.content.transfer.PrepareIndexViewModel_HiltModules;
import org.monora.uprotocol.client.android.fragment.content.transfer.WebShareLauncherFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.content.transfer.WebShareViewModel_HiltModules;
import org.monora.uprotocol.client.android.fragment.pickclient.AcceptClientFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.pickclient.BarcodeScannerFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.pickclient.BarcodeScannerViewModel_HiltModules;
import org.monora.uprotocol.client.android.fragment.pickclient.ClientConnectionFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.pickclient.ConnectionOptionsFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.pickclient.ManualConnectionFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.fragment.pickclient.ManualConnectionViewModel_HiltModules;
import org.monora.uprotocol.client.android.fragment.pickclient.PickClientFragment_GeneratedInjector;
import org.monora.uprotocol.client.android.receiver.BgBroadcastReceiver_GeneratedInjector;
import org.monora.uprotocol.client.android.service.BackgroundService_GeneratedInjector;
import org.monora.uprotocol.client.android.service.TogglingTileService_GeneratedInjector;
import org.monora.uprotocol.client.android.service.web.di.WebEntryPoint;
import org.monora.uprotocol.client.android.viewmodel.ChangelogViewModel_HiltModules;
import org.monora.uprotocol.client.android.viewmodel.ClientConnectionViewModel_HiltModules;
import org.monora.uprotocol.client.android.viewmodel.ClientPickerViewModel_HiltModules;
import org.monora.uprotocol.client.android.viewmodel.ClientsViewModel_HiltModules;
import org.monora.uprotocol.client.android.viewmodel.CrashLogViewModel_HiltModules;
import org.monora.uprotocol.client.android.viewmodel.FilesViewModel_HiltModules;
import org.monora.uprotocol.client.android.viewmodel.LicensesViewModel_HiltModules;
import org.monora.uprotocol.client.android.viewmodel.SharedTextsViewModel_HiltModules;
import org.monora.uprotocol.client.android.viewmodel.SharingSelectionViewModel_HiltModules;
import org.monora.uprotocol.client.android.viewmodel.SharingViewModel_HiltModules;
import org.monora.uprotocol.client.android.viewmodel.TransferManagerViewModel_HiltModules;
import org.monora.uprotocol.client.android.viewmodel.TransfersViewModel_HiltModules;
import org.monora.uprotocol.client.android.viewmodel.UserProfileViewModel_HiltModules;
import org.monora.uprotocol.client.android.viewmodel.content.ClientContentComponent;

public final class FileExplorer_HiltComponents {
  private FileExplorer_HiltComponents() {
  }

  @Module(
      subcomponents = ServiceC.class
  )
  @DisableInstallInCheck
  abstract interface ServiceCBuilderModule {
    @Binds
    ServiceComponentBuilder bind(ServiceC.Builder builder);
  }

  @Module(
      subcomponents = ActivityRetainedC.class
  )
  @DisableInstallInCheck
  abstract interface ActivityRetainedCBuilderModule {
    @Binds
    ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
  }

  @Module(
      subcomponents = ActivityC.class
  )
  @DisableInstallInCheck
  abstract interface ActivityCBuilderModule {
    @Binds
    ActivityComponentBuilder bind(ActivityC.Builder builder);
  }

  @Module(
      subcomponents = ViewModelC.class
  )
  @DisableInstallInCheck
  abstract interface ViewModelCBuilderModule {
    @Binds
    ViewModelComponentBuilder bind(ViewModelC.Builder builder);
  }

  @Module(
      subcomponents = ViewC.class
  )
  @DisableInstallInCheck
  abstract interface ViewCBuilderModule {
    @Binds
    ViewComponentBuilder bind(ViewC.Builder builder);
  }

  @Module(
      subcomponents = FragmentC.class
  )
  @DisableInstallInCheck
  abstract interface FragmentCBuilderModule {
    @Binds
    FragmentComponentBuilder bind(FragmentC.Builder builder);
  }

  @Module(
      subcomponents = ViewWithFragmentC.class
  )
  @DisableInstallInCheck
  abstract interface ViewWithFragmentCBuilderModule {
    @Binds
    ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
  }

  @Component(
      modules = {
          ApplicationContextModule.class,
          ActivityRetainedCBuilderModule.class,
          ServiceCBuilderModule.class,
          RoomModule.class,
          SingletonUprotocolModule.class,
          TransportSessionModule.class,
          WebServerModule.class
      }
  )
  @Singleton
  public abstract static class SingletonC implements HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint,
      ServiceComponentManager.ServiceComponentBuilderEntryPoint,
      SingletonComponent,
      GeneratedComponent,
      FileExplorer_GeneratedInjector,
      BgBroadcastReceiver_GeneratedInjector,
      WebEntryPoint {
  }

  @Subcomponent
  @ServiceScoped
  public abstract static class ServiceC implements ServiceComponent,
      GeneratedComponent,
      BackgroundService_GeneratedInjector,
      TogglingTileService_GeneratedInjector {
    @Subcomponent.Builder
    abstract interface Builder extends ServiceComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AppBrowserViewModel_HiltModules.KeyModule.class,
          AudioBrowserViewModel_HiltModules.KeyModule.class,
          BarcodeScannerViewModel_HiltModules.KeyModule.class,
          ChangelogViewModel_HiltModules.KeyModule.class,
          ClientConnectionViewModel_HiltModules.KeyModule.class,
          ClientPickerViewModel_HiltModules.KeyModule.class,
          ClientsViewModel_HiltModules.KeyModule.class,
          ContentBrowserViewModel_HiltModules.KeyModule.class,
          CrashLogViewModel_HiltModules.KeyModule.class,
          ActivityCBuilderModule.class,
          ViewModelCBuilderModule.class,
          FilesViewModel_HiltModules.KeyModule.class,
          HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
          ImageBrowserViewModel_HiltModules.KeyModule.class,
          LicensesViewModel_HiltModules.KeyModule.class,
          ManualConnectionViewModel_HiltModules.KeyModule.class,
          PreparationViewModel_HiltModules.KeyModule.class,
          PrepareIndexViewModel_HiltModules.KeyModule.class,
          ReceiverViewModel_HiltModules.KeyModule.class,
          SharedTextsViewModel_HiltModules.KeyModule.class,
          SharingSelectionViewModel_HiltModules.KeyModule.class,
          SharingSelectionsViewModel_HiltModules.KeyModule.class,
          SharingViewModel_HiltModules.KeyModule.class,
          TextEditorViewModel_HiltModules.KeyModule.class,
          TransferManagerViewModel_HiltModules.KeyModule.class,
          TransfersViewModel_HiltModules.KeyModule.class,
          UserProfileViewModel_HiltModules.KeyModule.class,
          VideoBrowserViewModel_HiltModules.KeyModule.class,
          WebShareViewModel_HiltModules.KeyModule.class
      }
  )
  @ActivityRetainedScoped
  public abstract static class ActivityRetainedC implements ActivityRetainedComponent,
      ActivityComponentManager.ActivityComponentBuilderEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityRetainedComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          FragmentCBuilderModule.class,
          ViewCBuilderModule.class,
          HiltWrapper_ActivityModule.class,
          HiltWrapper_DefaultViewModelFactories_ActivityModule.class
      }
  )
  @ActivityScoped
  public abstract static class ActivityC implements ActivityComponent,
      DefaultViewModelFactories.ActivityEntryPoint,
      HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint,
      FragmentComponentManager.FragmentComponentBuilderEntryPoint,
      ViewComponentManager.ViewComponentBuilderEntryPoint,
      GeneratedComponent,
      ContentBrowserActivity_GeneratedInjector,
      HomeActivity_GeneratedInjector,
      PackageInstallerActivity_GeneratedInjector,
      SharingActivity_GeneratedInjector,
      WelcomeActivity_GeneratedInjector,
      Activity_GeneratedInjector,
      ClientContentComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AppBrowserViewModel_HiltModules.BindsModule.class,
          AudioBrowserViewModel_HiltModules.BindsModule.class,
          BarcodeScannerViewModel_HiltModules.BindsModule.class,
          ChangelogViewModel_HiltModules.BindsModule.class,
          ClientConnectionViewModel_HiltModules.BindsModule.class,
          ClientPickerViewModel_HiltModules.BindsModule.class,
          ClientsViewModel_HiltModules.BindsModule.class,
          ContentBrowserViewModel_HiltModules.BindsModule.class,
          CrashLogViewModel_HiltModules.BindsModule.class,
          FilesViewModel_HiltModules.BindsModule.class,
          HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
          ImageBrowserViewModel_HiltModules.BindsModule.class,
          LicensesViewModel_HiltModules.BindsModule.class,
          ManualConnectionViewModel_HiltModules.BindsModule.class,
          PreparationViewModel_HiltModules.BindsModule.class,
          PrepareIndexViewModel_HiltModules.BindsModule.class,
          ReceiverViewModel_HiltModules.BindsModule.class,
          SharedTextsViewModel_HiltModules.BindsModule.class,
          SharingSelectionViewModel_HiltModules.BindsModule.class,
          SharingSelectionsViewModel_HiltModules.BindsModule.class,
          SharingViewModel_HiltModules.BindsModule.class,
          TextEditorViewModel_HiltModules.BindsModule.class,
          TransferManagerViewModel_HiltModules.BindsModule.class,
          TransfersViewModel_HiltModules.BindsModule.class,
          UserProfileViewModel_HiltModules.BindsModule.class,
          VideoBrowserViewModel_HiltModules.BindsModule.class,
          WebShareViewModel_HiltModules.BindsModule.class
      }
  )
  @ViewModelScoped
  public abstract static class ViewModelC implements ViewModelComponent,
      HiltViewModelFactory.ViewModelFactoriesEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewModelComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewC implements ViewComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewComponentBuilder {
    }
  }

  @Subcomponent(
      modules = ViewWithFragmentCBuilderModule.class
  )
  @FragmentScoped
  public abstract static class FragmentC implements FragmentComponent,
      DefaultViewModelFactories.FragmentEntryPoint,
      ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint,
      GeneratedComponent,
      IntroductionProfileFragment_GeneratedInjector,
      ChangelogFragment_GeneratedInjector,
      ClientDetailsFragment_GeneratedInjector,
      ContentBrowserFragment_GeneratedInjector,
      CrashLogFragment_GeneratedInjector,
      FilePickerFragment_GeneratedInjector,
      LicensesFragment_GeneratedInjector,
      ManageClientsFragment_GeneratedInjector,
      NetworkManagerFragment_GeneratedInjector,
      PrepareSharingFragment_GeneratedInjector,
      ProfileEditorFragment_GeneratedInjector,
      ReceiveFragment_GeneratedInjector,
      SharingFragment_GeneratedInjector,
      TextEditorFragment_GeneratedInjector,
      TransferDetailsFragment_GeneratedInjector,
      TransferHistoryFragment_GeneratedInjector,
      TransferItemFragment_GeneratedInjector,
      WebTransferDetailsFragment_GeneratedInjector,
      AppBrowserFragment_GeneratedInjector,
      AudioBrowserFragment_GeneratedInjector,
      FileBrowserFragment_GeneratedInjector,
      ImageBrowserFragment_GeneratedInjector,
      SelectionsFragment_GeneratedInjector,
      VideoBrowserFragment_GeneratedInjector,
      PrepareIndexFragment_GeneratedInjector,
      WebShareLauncherFragment_GeneratedInjector,
      AcceptClientFragment_GeneratedInjector,
      BarcodeScannerFragment_GeneratedInjector,
      ClientConnectionFragment_GeneratedInjector,
      ConnectionOptionsFragment_GeneratedInjector,
      ManualConnectionFragment_GeneratedInjector,
      PickClientFragment_GeneratedInjector {
    @Subcomponent.Builder
    abstract interface Builder extends FragmentComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewWithFragmentC implements ViewWithFragmentComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewWithFragmentComponentBuilder {
    }
  }
}
