package org.monora.uprotocol.client.android;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.monora.uprotocol.client.android.databinding.IncludeLayoutClientDetailBindingImpl;
import org.monora.uprotocol.client.android.databinding.LayoutBarcodeScannerBindingImpl;
import org.monora.uprotocol.client.android.databinding.LayoutClientConnectionBindingImpl;
import org.monora.uprotocol.client.android.databinding.LayoutClientDetailBindingImpl;
import org.monora.uprotocol.client.android.databinding.LayoutClientDetailPickBindingImpl;
import org.monora.uprotocol.client.android.databinding.LayoutConnectionOptionsBindingImpl;
import org.monora.uprotocol.client.android.databinding.LayoutContentBrowserBindingImpl;
import org.monora.uprotocol.client.android.databinding.LayoutEmptyContentBindingImpl;
import org.monora.uprotocol.client.android.databinding.LayoutManualConnectionBindingImpl;
import org.monora.uprotocol.client.android.databinding.LayoutPrepareSharingBindingImpl;
import org.monora.uprotocol.client.android.databinding.LayoutProfileEditorBindingImpl;
import org.monora.uprotocol.client.android.databinding.LayoutReceiveBindingImpl;
import org.monora.uprotocol.client.android.databinding.LayoutSharingBindingImpl;
import org.monora.uprotocol.client.android.databinding.LayoutSplashBindingImpl;
import org.monora.uprotocol.client.android.databinding.LayoutTransferDetailsBindingImpl;
import org.monora.uprotocol.client.android.databinding.LayoutTransferDetailsBindingLandImpl;
import org.monora.uprotocol.client.android.databinding.LayoutTransferItemBindingImpl;
import org.monora.uprotocol.client.android.databinding.LayoutUserProfileBindingImpl;
import org.monora.uprotocol.client.android.databinding.LayoutWebShareLauncherBindingImpl;
import org.monora.uprotocol.client.android.databinding.LayoutWebTransferDetailsBindingImpl;
import org.monora.uprotocol.client.android.databinding.LayoutWifiConnectBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListAlbumBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListAppBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListArtistBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListClientGridBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListConnectionBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListFileNouveauBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListFilePickerBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListImageBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListImageBucketBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListLibraryLicenseBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListManageClientBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListPathBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListPermissionBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListPickClientBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListSectionDateBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListSectionTitleBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListSharedTextBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListSharingItemBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListSongBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListTransferBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListTransferItemBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListVideoBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListVideoBucketBindingImpl;
import org.monora.uprotocol.client.android.databinding.ListWebTransferBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_INCLUDELAYOUTCLIENTDETAIL = 1;

  private static final int LAYOUT_LAYOUTBARCODESCANNER = 2;

  private static final int LAYOUT_LAYOUTCLIENTCONNECTION = 3;

  private static final int LAYOUT_LAYOUTCLIENTDETAIL = 4;

  private static final int LAYOUT_LAYOUTCLIENTDETAILPICK = 5;

  private static final int LAYOUT_LAYOUTCONNECTIONOPTIONS = 6;

  private static final int LAYOUT_LAYOUTCONTENTBROWSER = 7;

  private static final int LAYOUT_LAYOUTEMPTYCONTENT = 8;

  private static final int LAYOUT_LAYOUTMANUALCONNECTION = 9;

  private static final int LAYOUT_LAYOUTPREPARESHARING = 10;

  private static final int LAYOUT_LAYOUTPROFILEEDITOR = 11;

  private static final int LAYOUT_LAYOUTRECEIVE = 12;

  private static final int LAYOUT_LAYOUTSHARING = 13;

  private static final int LAYOUT_LAYOUTSPLASH = 14;

  private static final int LAYOUT_LAYOUTTRANSFERDETAILS = 15;

  private static final int LAYOUT_LAYOUTTRANSFERITEM = 16;

  private static final int LAYOUT_LAYOUTUSERPROFILE = 17;

  private static final int LAYOUT_LAYOUTWEBSHARELAUNCHER = 18;

  private static final int LAYOUT_LAYOUTWEBTRANSFERDETAILS = 19;

  private static final int LAYOUT_LAYOUTWIFICONNECT = 20;

  private static final int LAYOUT_LISTALBUM = 21;

  private static final int LAYOUT_LISTAPP = 22;

  private static final int LAYOUT_LISTARTIST = 23;

  private static final int LAYOUT_LISTCLIENTGRID = 24;

  private static final int LAYOUT_LISTCONNECTION = 25;

  private static final int LAYOUT_LISTFILENOUVEAU = 26;

  private static final int LAYOUT_LISTFILEPICKER = 27;

  private static final int LAYOUT_LISTIMAGE = 28;

  private static final int LAYOUT_LISTIMAGEBUCKET = 29;

  private static final int LAYOUT_LISTLIBRARYLICENSE = 30;

  private static final int LAYOUT_LISTMANAGECLIENT = 31;

  private static final int LAYOUT_LISTPATH = 32;

  private static final int LAYOUT_LISTPERMISSION = 33;

  private static final int LAYOUT_LISTPICKCLIENT = 34;

  private static final int LAYOUT_LISTSECTIONDATE = 35;

  private static final int LAYOUT_LISTSECTIONTITLE = 36;

  private static final int LAYOUT_LISTSHAREDTEXT = 37;

  private static final int LAYOUT_LISTSHARINGITEM = 38;

  private static final int LAYOUT_LISTSONG = 39;

  private static final int LAYOUT_LISTTRANSFER = 40;

  private static final int LAYOUT_LISTTRANSFERITEM = 41;

  private static final int LAYOUT_LISTVIDEO = 42;

  private static final int LAYOUT_LISTVIDEOBUCKET = 43;

  private static final int LAYOUT_LISTWEBTRANSFER = 44;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(44);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.include_layout_client_detail, LAYOUT_INCLUDELAYOUTCLIENTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.layout_barcode_scanner, LAYOUT_LAYOUTBARCODESCANNER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.layout_client_connection, LAYOUT_LAYOUTCLIENTCONNECTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.layout_client_detail, LAYOUT_LAYOUTCLIENTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.layout_client_detail_pick, LAYOUT_LAYOUTCLIENTDETAILPICK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.layout_connection_options, LAYOUT_LAYOUTCONNECTIONOPTIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.layout_content_browser, LAYOUT_LAYOUTCONTENTBROWSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.layout_empty_content, LAYOUT_LAYOUTEMPTYCONTENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.layout_manual_connection, LAYOUT_LAYOUTMANUALCONNECTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.layout_prepare_sharing, LAYOUT_LAYOUTPREPARESHARING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.layout_profile_editor, LAYOUT_LAYOUTPROFILEEDITOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.layout_receive, LAYOUT_LAYOUTRECEIVE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.layout_sharing, LAYOUT_LAYOUTSHARING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.layout_splash, LAYOUT_LAYOUTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.layout_transfer_details, LAYOUT_LAYOUTTRANSFERDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.layout_transfer_item, LAYOUT_LAYOUTTRANSFERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.layout_user_profile, LAYOUT_LAYOUTUSERPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.layout_web_share_launcher, LAYOUT_LAYOUTWEBSHARELAUNCHER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.layout_web_transfer_details, LAYOUT_LAYOUTWEBTRANSFERDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.layout_wifi_connect, LAYOUT_LAYOUTWIFICONNECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_album, LAYOUT_LISTALBUM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_app, LAYOUT_LISTAPP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_artist, LAYOUT_LISTARTIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_client_grid, LAYOUT_LISTCLIENTGRID);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_connection, LAYOUT_LISTCONNECTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_file_nouveau, LAYOUT_LISTFILENOUVEAU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_file_picker, LAYOUT_LISTFILEPICKER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_image, LAYOUT_LISTIMAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_image_bucket, LAYOUT_LISTIMAGEBUCKET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_library_license, LAYOUT_LISTLIBRARYLICENSE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_manage_client, LAYOUT_LISTMANAGECLIENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_path, LAYOUT_LISTPATH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_permission, LAYOUT_LISTPERMISSION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_pick_client, LAYOUT_LISTPICKCLIENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_section_date, LAYOUT_LISTSECTIONDATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_section_title, LAYOUT_LISTSECTIONTITLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_shared_text, LAYOUT_LISTSHAREDTEXT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_sharing_item, LAYOUT_LISTSHARINGITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_song, LAYOUT_LISTSONG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_transfer, LAYOUT_LISTTRANSFER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_transfer_item, LAYOUT_LISTTRANSFERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_video, LAYOUT_LISTVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_video_bucket, LAYOUT_LISTVIDEOBUCKET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.monora.uprotocol.client.android.R.layout.list_web_transfer, LAYOUT_LISTWEBTRANSFER);
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
        case  LAYOUT_INCLUDELAYOUTCLIENTDETAIL: {
          if ("layout/include_layout_client_detail_0".equals(tag)) {
            return new IncludeLayoutClientDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for include_layout_client_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTBARCODESCANNER: {
          if ("layout/layout_barcode_scanner_0".equals(tag)) {
            return new LayoutBarcodeScannerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_barcode_scanner is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTCLIENTCONNECTION: {
          if ("layout/layout_client_connection_0".equals(tag)) {
            return new LayoutClientConnectionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_client_connection is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTCLIENTDETAIL: {
          if ("layout/layout_client_detail_0".equals(tag)) {
            return new LayoutClientDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_client_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTCLIENTDETAILPICK: {
          if ("layout/layout_client_detail_pick_0".equals(tag)) {
            return new LayoutClientDetailPickBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_client_detail_pick is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTCONNECTIONOPTIONS: {
          if ("layout/layout_connection_options_0".equals(tag)) {
            return new LayoutConnectionOptionsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_connection_options is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTCONTENTBROWSER: {
          if ("layout/layout_content_browser_0".equals(tag)) {
            return new LayoutContentBrowserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_content_browser is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTEMPTYCONTENT: {
          if ("layout/layout_empty_content_0".equals(tag)) {
            return new LayoutEmptyContentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_empty_content is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTMANUALCONNECTION: {
          if ("layout/layout_manual_connection_0".equals(tag)) {
            return new LayoutManualConnectionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_manual_connection is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTPREPARESHARING: {
          if ("layout/layout_prepare_sharing_0".equals(tag)) {
            return new LayoutPrepareSharingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_prepare_sharing is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTPROFILEEDITOR: {
          if ("layout/layout_profile_editor_0".equals(tag)) {
            return new LayoutProfileEditorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_profile_editor is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTRECEIVE: {
          if ("layout/layout_receive_0".equals(tag)) {
            return new LayoutReceiveBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_receive is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTSHARING: {
          if ("layout/layout_sharing_0".equals(tag)) {
            return new LayoutSharingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_sharing is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTSPLASH: {
          if ("layout/layout_splash_0".equals(tag)) {
            return new LayoutSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTTRANSFERDETAILS: {
          if ("layout/layout_transfer_details_0".equals(tag)) {
            return new LayoutTransferDetailsBindingImpl(component, view);
          }
          if ("layout-land/layout_transfer_details_0".equals(tag)) {
            return new LayoutTransferDetailsBindingLandImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_transfer_details is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTTRANSFERITEM: {
          if ("layout/layout_transfer_item_0".equals(tag)) {
            return new LayoutTransferItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_transfer_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTUSERPROFILE: {
          if ("layout/layout_user_profile_0".equals(tag)) {
            return new LayoutUserProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_user_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTWEBSHARELAUNCHER: {
          if ("layout/layout_web_share_launcher_0".equals(tag)) {
            return new LayoutWebShareLauncherBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_web_share_launcher is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTWEBTRANSFERDETAILS: {
          if ("layout/layout_web_transfer_details_0".equals(tag)) {
            return new LayoutWebTransferDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_web_transfer_details is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTWIFICONNECT: {
          if ("layout/layout_wifi_connect_0".equals(tag)) {
            return new LayoutWifiConnectBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_wifi_connect is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTALBUM: {
          if ("layout/list_album_0".equals(tag)) {
            return new ListAlbumBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_album is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTAPP: {
          if ("layout/list_app_0".equals(tag)) {
            return new ListAppBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_app is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTARTIST: {
          if ("layout/list_artist_0".equals(tag)) {
            return new ListArtistBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_artist is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTCLIENTGRID: {
          if ("layout/list_client_grid_0".equals(tag)) {
            return new ListClientGridBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_client_grid is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTCONNECTION: {
          if ("layout/list_connection_0".equals(tag)) {
            return new ListConnectionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_connection is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTFILENOUVEAU: {
          if ("layout/list_file_nouveau_0".equals(tag)) {
            return new ListFileNouveauBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_file_nouveau is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTFILEPICKER: {
          if ("layout/list_file_picker_0".equals(tag)) {
            return new ListFilePickerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_file_picker is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTIMAGE: {
          if ("layout/list_image_0".equals(tag)) {
            return new ListImageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_image is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTIMAGEBUCKET: {
          if ("layout/list_image_bucket_0".equals(tag)) {
            return new ListImageBucketBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_image_bucket is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTLIBRARYLICENSE: {
          if ("layout/list_library_license_0".equals(tag)) {
            return new ListLibraryLicenseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_library_license is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTMANAGECLIENT: {
          if ("layout/list_manage_client_0".equals(tag)) {
            return new ListManageClientBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_manage_client is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTPATH: {
          if ("layout/list_path_0".equals(tag)) {
            return new ListPathBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_path is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTPERMISSION: {
          if ("layout/list_permission_0".equals(tag)) {
            return new ListPermissionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_permission is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTPICKCLIENT: {
          if ("layout/list_pick_client_0".equals(tag)) {
            return new ListPickClientBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_pick_client is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTSECTIONDATE: {
          if ("layout/list_section_date_0".equals(tag)) {
            return new ListSectionDateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_section_date is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTSECTIONTITLE: {
          if ("layout/list_section_title_0".equals(tag)) {
            return new ListSectionTitleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_section_title is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTSHAREDTEXT: {
          if ("layout/list_shared_text_0".equals(tag)) {
            return new ListSharedTextBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_shared_text is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTSHARINGITEM: {
          if ("layout/list_sharing_item_0".equals(tag)) {
            return new ListSharingItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_sharing_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTSONG: {
          if ("layout/list_song_0".equals(tag)) {
            return new ListSongBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_song is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTTRANSFER: {
          if ("layout/list_transfer_0".equals(tag)) {
            return new ListTransferBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_transfer is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTTRANSFERITEM: {
          if ("layout/list_transfer_item_0".equals(tag)) {
            return new ListTransferItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_transfer_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTVIDEO: {
          if ("layout/list_video_0".equals(tag)) {
            return new ListVideoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_video is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTVIDEOBUCKET: {
          if ("layout/list_video_bucket_0".equals(tag)) {
            return new ListVideoBucketBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_video_bucket is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTWEBTRANSFER: {
          if ("layout/list_web_transfer_0".equals(tag)) {
            return new ListWebTransferBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_web_transfer is invalid. Received: " + tag);
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
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(13);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "blocked");
      sKeys.put(2, "clickListener");
      sKeys.put(3, "clientViewModel");
      sKeys.put(4, "detailsClickListener");
      sKeys.put(5, "editProfileClickListener");
      sKeys.put(6, "feederModel");
      sKeys.put(7, "pickPhotoClickListener");
      sKeys.put(8, "selectionType");
      sKeys.put(9, "stateViewModel");
      sKeys.put(10, "transferViewModel");
      sKeys.put(11, "trusted");
      sKeys.put(12, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(45);

    static {
      sKeys.put("layout/include_layout_client_detail_0", org.monora.uprotocol.client.android.R.layout.include_layout_client_detail);
      sKeys.put("layout/layout_barcode_scanner_0", org.monora.uprotocol.client.android.R.layout.layout_barcode_scanner);
      sKeys.put("layout/layout_client_connection_0", org.monora.uprotocol.client.android.R.layout.layout_client_connection);
      sKeys.put("layout/layout_client_detail_0", org.monora.uprotocol.client.android.R.layout.layout_client_detail);
      sKeys.put("layout/layout_client_detail_pick_0", org.monora.uprotocol.client.android.R.layout.layout_client_detail_pick);
      sKeys.put("layout/layout_connection_options_0", org.monora.uprotocol.client.android.R.layout.layout_connection_options);
      sKeys.put("layout/layout_content_browser_0", org.monora.uprotocol.client.android.R.layout.layout_content_browser);
      sKeys.put("layout/layout_empty_content_0", org.monora.uprotocol.client.android.R.layout.layout_empty_content);
      sKeys.put("layout/layout_manual_connection_0", org.monora.uprotocol.client.android.R.layout.layout_manual_connection);
      sKeys.put("layout/layout_prepare_sharing_0", org.monora.uprotocol.client.android.R.layout.layout_prepare_sharing);
      sKeys.put("layout/layout_profile_editor_0", org.monora.uprotocol.client.android.R.layout.layout_profile_editor);
      sKeys.put("layout/layout_receive_0", org.monora.uprotocol.client.android.R.layout.layout_receive);
      sKeys.put("layout/layout_sharing_0", org.monora.uprotocol.client.android.R.layout.layout_sharing);
      sKeys.put("layout/layout_splash_0", org.monora.uprotocol.client.android.R.layout.layout_splash);
      sKeys.put("layout/layout_transfer_details_0", org.monora.uprotocol.client.android.R.layout.layout_transfer_details);
      sKeys.put("layout-land/layout_transfer_details_0", org.monora.uprotocol.client.android.R.layout.layout_transfer_details);
      sKeys.put("layout/layout_transfer_item_0", org.monora.uprotocol.client.android.R.layout.layout_transfer_item);
      sKeys.put("layout/layout_user_profile_0", org.monora.uprotocol.client.android.R.layout.layout_user_profile);
      sKeys.put("layout/layout_web_share_launcher_0", org.monora.uprotocol.client.android.R.layout.layout_web_share_launcher);
      sKeys.put("layout/layout_web_transfer_details_0", org.monora.uprotocol.client.android.R.layout.layout_web_transfer_details);
      sKeys.put("layout/layout_wifi_connect_0", org.monora.uprotocol.client.android.R.layout.layout_wifi_connect);
      sKeys.put("layout/list_album_0", org.monora.uprotocol.client.android.R.layout.list_album);
      sKeys.put("layout/list_app_0", org.monora.uprotocol.client.android.R.layout.list_app);
      sKeys.put("layout/list_artist_0", org.monora.uprotocol.client.android.R.layout.list_artist);
      sKeys.put("layout/list_client_grid_0", org.monora.uprotocol.client.android.R.layout.list_client_grid);
      sKeys.put("layout/list_connection_0", org.monora.uprotocol.client.android.R.layout.list_connection);
      sKeys.put("layout/list_file_nouveau_0", org.monora.uprotocol.client.android.R.layout.list_file_nouveau);
      sKeys.put("layout/list_file_picker_0", org.monora.uprotocol.client.android.R.layout.list_file_picker);
      sKeys.put("layout/list_image_0", org.monora.uprotocol.client.android.R.layout.list_image);
      sKeys.put("layout/list_image_bucket_0", org.monora.uprotocol.client.android.R.layout.list_image_bucket);
      sKeys.put("layout/list_library_license_0", org.monora.uprotocol.client.android.R.layout.list_library_license);
      sKeys.put("layout/list_manage_client_0", org.monora.uprotocol.client.android.R.layout.list_manage_client);
      sKeys.put("layout/list_path_0", org.monora.uprotocol.client.android.R.layout.list_path);
      sKeys.put("layout/list_permission_0", org.monora.uprotocol.client.android.R.layout.list_permission);
      sKeys.put("layout/list_pick_client_0", org.monora.uprotocol.client.android.R.layout.list_pick_client);
      sKeys.put("layout/list_section_date_0", org.monora.uprotocol.client.android.R.layout.list_section_date);
      sKeys.put("layout/list_section_title_0", org.monora.uprotocol.client.android.R.layout.list_section_title);
      sKeys.put("layout/list_shared_text_0", org.monora.uprotocol.client.android.R.layout.list_shared_text);
      sKeys.put("layout/list_sharing_item_0", org.monora.uprotocol.client.android.R.layout.list_sharing_item);
      sKeys.put("layout/list_song_0", org.monora.uprotocol.client.android.R.layout.list_song);
      sKeys.put("layout/list_transfer_0", org.monora.uprotocol.client.android.R.layout.list_transfer);
      sKeys.put("layout/list_transfer_item_0", org.monora.uprotocol.client.android.R.layout.list_transfer_item);
      sKeys.put("layout/list_video_0", org.monora.uprotocol.client.android.R.layout.list_video);
      sKeys.put("layout/list_video_bucket_0", org.monora.uprotocol.client.android.R.layout.list_video_bucket);
      sKeys.put("layout/list_web_transfer_0", org.monora.uprotocol.client.android.R.layout.list_web_transfer);
    }
  }
}
