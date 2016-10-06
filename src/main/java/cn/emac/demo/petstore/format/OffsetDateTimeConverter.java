package cn.emac.demo.petstore.format;

import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.Assert;

import java.time.Instant;
import java.time.OffsetDateTime;

import static java.time.ZoneId.systemDefault;

/**
 * 基于毫秒值的{@code OffsetDateTime}数据类型转换器。
 *
 * @author Emac
 * @since 2016-10-06
 */
public class OffsetDateTimeConverter implements Converter<String, OffsetDateTime> {

    @Override
    public OffsetDateTime convert(String source) {
        Assert.isTrue(NumberUtils.isNumber(source));

        Long milli = NumberUtils.createLong(source);
        return OffsetDateTime.ofInstant(Instant.ofEpochMilli(milli), systemDefault());
    }
}
