/**
 * Created on  13-09-24 10:20
 */
package com.alicp.jetcache.embedded;

import com.alicp.jetcache.Cache;
import com.alicp.jetcache.CacheConfig;
import org.junit.Test;

import java.util.function.Function;

/**
 * @author <a href="mailto:yeli.hl@taobao.com">huangli</a>
 */
public class LinkedHashMapCacheTest extends AbstractLocalCacheTest {

    @Override
    protected Function<CacheConfig, Cache> getBuildFunc() {
        return (c) -> new LinkedHashMapCache((EmbeddedCacheConfig) c);
    }

    @Override
    @Test
    public void test1() throws Exception {
        super.test1();
    }

    @Override
    @Test
    public void testLRU1() {
        super.testLRU1();
    }

    @Override
    @Test
    public void testLRU2() {
        super.testLRU2();
    }

    @Override
    @Test
    public void testExpire() throws Exception {
        super.testExpire();
    }

    @Override
    @Test
    public void testNull() {
        super.testNull();
    }

    @Override
    @Test
    public void testConcurrent() throws Exception {
        super.testConcurrent();
    }
}
