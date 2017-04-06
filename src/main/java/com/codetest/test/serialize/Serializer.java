package com.codetest.test.serialize;

/**
 * Created by calmlyzhang on 2016/12/23.
 */
public abstract interface Serializer
{
    public abstract byte[] serialize(Object paramObject)
            throws Exception;

    public abstract <T> T deserialize(byte[] paramArrayOfByte)
            throws Exception;


}