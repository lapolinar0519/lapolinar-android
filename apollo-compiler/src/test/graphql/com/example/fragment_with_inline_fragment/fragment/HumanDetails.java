// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragment_with_inline_fragment.fragment;

import com.apollographql.apollo.api.GraphqlFragment;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.internal.Utils;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import org.jetbrains.annotations.NotNull;

public class HumanDetails implements GraphqlFragment {
  static final ResponseField[] $responseFields = {
    ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
    ResponseField.forString("name", "name", null, false, Collections.<ResponseField.Condition>emptyList())
  };

  public static final String FRAGMENT_DEFINITION = "fragment HumanDetails on Human {\n"
      + "  __typename\n"
      + "  name\n"
      + "}";

  final @NotNull String __typename;

  final @NotNull String name;

  private transient volatile String $toString;

  private transient volatile int $hashCode;

  private transient volatile boolean $hashCodeMemoized;

  public HumanDetails(@NotNull String __typename, @NotNull String name) {
    this.__typename = Utils.checkNotNull(__typename, "__typename == null");
    this.name = Utils.checkNotNull(name, "name == null");
  }

  public @NotNull String __typename() {
    return this.__typename;
  }

  /**
   * What this human calls themselves
   */
  public @NotNull String name() {
    return this.name;
  }

  @SuppressWarnings("unchecked")
  public ResponseFieldMarshaller marshaller() {
    return new ResponseFieldMarshaller() {
      @Override
      public void marshal(ResponseWriter writer) {
        writer.writeString($responseFields[0], __typename);
        writer.writeString($responseFields[1], name);
      }
    };
  }

  @Override
  public String toString() {
    if ($toString == null) {
      $toString = "HumanDetails{"
        + "__typename=" + __typename + ", "
        + "name=" + name
        + "}";
    }
    return $toString;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof HumanDetails) {
      HumanDetails that = (HumanDetails) o;
      return this.__typename.equals(that.__typename)
       && this.name.equals(that.name);
    }
    return false;
  }

  @Override
  public int hashCode() {
    if (!$hashCodeMemoized) {
      int h = 1;
      h *= 1000003;
      h ^= __typename.hashCode();
      h *= 1000003;
      h ^= name.hashCode();
      $hashCode = h;
      $hashCodeMemoized = true;
    }
    return $hashCode;
  }

  public Builder toBuilder() {
    Builder builder = new Builder();
    builder.__typename = __typename;
    builder.name = name;
    return builder;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Mapper implements ResponseFieldMapper<HumanDetails> {
    @Override
    public HumanDetails map(ResponseReader reader) {
      final String __typename = reader.readString($responseFields[0]);
      final String name = reader.readString($responseFields[1]);
      return new HumanDetails(__typename, name);
    }
  }

  public static final class Builder {
    private @NotNull String __typename;

    private @NotNull String name;

    Builder() {
    }

    public Builder __typename(@NotNull String __typename) {
      this.__typename = __typename;
      return this;
    }

    public Builder name(@NotNull String name) {
      this.name = name;
      return this;
    }

    public HumanDetails build() {
      Utils.checkNotNull(__typename, "__typename == null");
      Utils.checkNotNull(name, "name == null");
      return new HumanDetails(__typename, name);
    }
  }
}