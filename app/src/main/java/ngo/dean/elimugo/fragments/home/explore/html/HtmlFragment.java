package ngo.dean.elimugo.fragments.home.explore.html;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import ngo.dean.elimugo.App;
import ngo.dean.elimugo.R;
import ngo.dean.elimugo.fragments.home.download.status.DownloadStatusFragmentArgs;
import ngo.dean.elimugo.repositories.models.ContentModule;
import ngo.dean.elimugo.repositories.models.ParcelableContentModule;

public class HtmlFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_html, container, false);

        ContentModule module = HtmlFragmentArgs.fromBundle(getArguments()).getContentPackage();

        String path = String.format("file:///%s/%s/%s/index.html", requireContext().getExternalFilesDir("content"), module.uniqueId, App.LOCALE);
        bindWebView(root, path);

        return root;
    }

    private void bindWebView(View root, String path) {
        WebView webView = root.findViewById(R.id.webView);
        webView.getSettings().setAllowFileAccess(true);
        webView.loadUrl(path);
    }
}