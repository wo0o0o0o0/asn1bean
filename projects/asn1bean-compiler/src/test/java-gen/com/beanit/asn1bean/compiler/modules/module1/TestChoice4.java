/**
 * This class file was automatically generated by ASN1bean (http://www.beanit.com)
 */

package com.beanit.asn1bean.compiler.modules.module1;

import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.io.Serializable;
import com.beanit.asn1bean.ber.*;
import com.beanit.asn1bean.ber.types.*;
import com.beanit.asn1bean.ber.types.string.*;

import com.beanit.asn1bean.compiler.modules.module2.EmployeeNumberZ;
import com.beanit.asn1bean.compiler.modules.module3.Datezz;
import com.beanit.asn1bean.compiler.modules.module3.EmployeeNumberzz;

public class TestChoice4 extends TestChoice3 {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 12);

	private byte[] code = null;

	public TestChoice4() {
	}

	public TestChoice4(byte[] code) {
		this.code = code;
	}

	@Override public int encode(OutputStream reverseOS, boolean withTag) throws IOException {

		if (code != null) {
			reverseOS.write(code);
			if (withTag) {
				return tag.encode(reverseOS) + code.length;
			}
			return code.length;
		}

		int codeLength;

		codeLength = super.encode(reverseOS, true);
		codeLength += BerLength.encodeLength(reverseOS, codeLength);
		if (withTag) {
			codeLength += tag.encode(reverseOS);
		}

		return codeLength;
	}

	@Override public int decode(InputStream is, boolean withTag) throws IOException {

		int codeLength = 0;

		if (withTag) {
			codeLength += tag.decodeAndCheck(is);
		}

		BerLength length = new BerLength();
		codeLength += length.decode(is);

		codeLength += super.decode(is, true);
		codeLength += length.readEocIfIndefinite(is);

		return codeLength;
	}

}
