package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new org.monora.uprotocol.client.android.DataBinderMapperImpl());
  }
}
