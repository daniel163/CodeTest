package com.codetest.test;

import com.codetest.test.utils.Base64;
import com.codetest.test.utils.EnDeCodeUtils;
import com.codetest.test.utils.GZipUtils;
import com.codetest.test.utils2.JsonUtils;

import java.io.UnsupportedEncodingException;

/**
 * Created by nickzhang on 2017/5/19.
 */
public class base64 {

    public static final String SUPER_BATTERY_KEY = "nfOSBiCDpWHv8B8s";
    public static final String CHARSET_NAME = "UTF-8";

    /****
     * 解密
     * @param result
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String  decryptResultSuperBattery(byte[] result) throws UnsupportedEncodingException {
        byte[] temp1 = Base64.decode(result,1);
        byte[] temp2 = GZipUtils.decompress(temp1);
        byte[] temp3 = EnDeCodeUtils.decrypt(SUPER_BATTERY_KEY,temp2);
        return new String(temp3);
    }


    /***
     * 加密
     * @param result
     * @return
     * @throws UnsupportedEncodingException
     */
    public byte[] encryptResultSuperBattery(Object result) throws UnsupportedEncodingException {
        return Base64.encode(GZipUtils.compress(EnDeCodeUtils.encrypt(SUPER_BATTERY_KEY, JsonUtils.obj2json(result).getBytes(CHARSET_NAME))),1);
    }

    public static void main(String[] args) throws Exception{

        String test = "H4sIAAAAAAAAAAGgAV/+mfv6Bg7GmA0rLiO42dheD6cU84WhFlCsrXkx7KVKYBILpy5jJvLVwTTZ7oPnYyrmFMBbhKw6jCMgbMRlgTfG0M6OrgcjDhW8H+I85ijzwdA3giM5hQ/W1QU1LUuS3iuSOrDYlJoHAFwz6eVZSzUbYExkzBqmugPXmbV2SMZb/LuhibhQWOIafZg9f/IFBCAHJLU9tisTER9gxIQ55WjyRcUBz8Gy2tDc7KdcEri4gx0zssmjzSNYcEZS+nY5TN0R9X7nFZ/0YFDG+lS7THnQ4AhwjdXl53xlcBwTZgifHyzFees6nvASzYRiDl4TqIukQbRTYpk++P8+fo1UOM6vhKqzVKxXr794GRr2HakRhTVpPIL2Ji8GHCz2nkzt344osT6Al8jese2XfZrVr+zYR5yefXpdmpnOUyt5VFExHB82XJYJaO4yCYlNl1lgVOXPMwdRSfTCTA7unKjq7W8yRW4uJIPRDEXYm7ntpxF03ACHaPG/rd3QAiFUSsdk5al8cnZbdKKNSm4mXYqevgdMVN5X3tSWgTx1EyVFC7w81lEsWSBIoAEAAA";

        System.out.println(decryptResultSuperBattery(test.getBytes()));
    }


}
