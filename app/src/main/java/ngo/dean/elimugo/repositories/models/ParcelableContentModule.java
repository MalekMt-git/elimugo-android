package ngo.dean.elimugo.repositories.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Arrays;

public class ParcelableContentModule extends ContentModule implements Parcelable {

    public ParcelableContentModule(ContentModule module) {
        isToggled = module.isToggled;
        uniqueId = module.uniqueId;
        descriptions = module.descriptions;
        type = module.type;
        contentVersion = module.contentVersion;
        accessibility = module.accessibility;
        releaseDate = module.releaseDate;
        size = module.size;
        isUpdate = module.isUpdate;
    }

    protected ParcelableContentModule(Parcel in) {
        isToggled = in.readByte() != 0;
        uniqueId = in.readString();
        descriptions = (ContentDescriptions) in.readTypedObject(ParcelableContentDescriptions.CREATOR);
        type = in.readString();
        contentVersion = in.readString();
        accessibility = in.readString();
        releaseDate = in.readString();
        size = new FileSize(in.readInt());
        isUpdate = in.readByte() != 0;
    }

    public static final Creator<ParcelableContentModule> CREATOR = new Creator<ParcelableContentModule>() {
        @Override
        public ParcelableContentModule createFromParcel(Parcel in) {
            return new ParcelableContentModule(in);
        }

        @Override
        public ParcelableContentModule[] newArray(int size) {
            return new ParcelableContentModule[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte((byte) (isToggled ? 1 : 0));
        dest.writeString(uniqueId);
        dest.writeTypedObject(new ParcelableContentDescriptions(descriptions), 0);
        dest.writeString(type);
        dest.writeString(contentVersion);
        dest.writeString(accessibility);
        dest.writeString(releaseDate);
        dest.writeInt(size.value);
        dest.writeByte((byte) (isUpdate ? 1 : 0));
    }
}
