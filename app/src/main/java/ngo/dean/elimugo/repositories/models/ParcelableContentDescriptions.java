/*
package ngo.dean.elimugo.repositories.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class ParcelableContentDescriptions extends ContentDescriptions implements Parcelable {

    public ParcelableContentDescriptions(ContentDescriptions descriptions) {
        this.descriptions = descriptions.descriptions;
    }

    protected ParcelableContentDescriptions(Parcel in) {
        descriptions = new HashMap<>();
        int size = in.readInt();
        for (int i = 0; i < size; i++) {
            String key = in.readString();
            String value = in.readString();
            descriptions.put(key, value);
        }
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(descriptions.size());
        for (Map.Entry<String, String> description : descriptions.entrySet()) {
            dest.writeString(description.getKey());
            dest.writeString(description.getValue());
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ParcelableContentDescriptions> CREATOR = new Creator<ParcelableContentDescriptions>() {
        @Override
        public ParcelableContentDescriptions createFromParcel(Parcel in) {
            return new ParcelableContentDescriptions(in);
        }

        @Override
        public ParcelableContentDescriptions[] newArray(int size) {
            return new ParcelableContentDescriptions[size];
        }
    };
}
*/
