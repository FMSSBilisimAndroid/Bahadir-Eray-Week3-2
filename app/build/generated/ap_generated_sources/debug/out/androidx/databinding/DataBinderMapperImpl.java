package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.patika.week3appnavigation.DataBinderMapperImpl());
  }
}
