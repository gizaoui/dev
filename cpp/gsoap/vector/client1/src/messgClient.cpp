/* messgClient.cpp
   Generated by gSOAP 2.8.17r from ../../common/include/messg.h

Copyright(C) 2000-2013, Robert van Engelen, Genivia Inc. All Rights Reserved.
The generated code is released under one of the following licenses:
GPL or Genivia's license for commercial use.
This program is released under the GPL with the additional exemption that
compiling, linking, and/or using OpenSSL is allowed.
*/

#if defined(__BORLANDC__)
#pragma option push -w-8060
#pragma option push -w-8004
#endif
#include "messgH.h"

SOAP_SOURCE_STAMP("@(#) messgClient.cpp ver 2.8.17r 2014-02-28 18:15:33 GMT")


SOAP_FMAC5 int SOAP_FMAC6 soap_call_ns__test1(struct soap *soap, const char *soap_endpoint, const char *soap_action, int _param_1, std::string _param_2, ns__messgResponse &out)
{	struct ns__test1 soap_tmp_ns__test1;
	if (soap_endpoint == NULL)
		soap_endpoint = "http://localhost:8080/messgserver";
	soap_begin(soap);
	soap->encodingStyle = NULL;
	soap_tmp_ns__test1._param_1 = _param_1;
	soap_tmp_ns__test1._param_2 = _param_2;
	soap_serializeheader(soap);
	soap_serialize_ns__test1(soap, &soap_tmp_ns__test1);
	if (soap_begin_count(soap))
		return soap->error;
	if (soap->mode & SOAP_IO_LENGTH)
	{	if (soap_envelope_begin_out(soap)
		 || soap_putheader(soap)
		 || soap_body_begin_out(soap)
		 || soap_put_ns__test1(soap, &soap_tmp_ns__test1, "ns:test1", NULL)
		 || soap_body_end_out(soap)
		 || soap_envelope_end_out(soap))
			 return soap->error;
	}
	if (soap_end_count(soap))
		return soap->error;
	if (soap_connect(soap, soap_url(soap, soap_endpoint, NULL), soap_action)
	 || soap_envelope_begin_out(soap)
	 || soap_putheader(soap)
	 || soap_body_begin_out(soap)
	 || soap_put_ns__test1(soap, &soap_tmp_ns__test1, "ns:test1", NULL)
	 || soap_body_end_out(soap)
	 || soap_envelope_end_out(soap)
	 || soap_end_send(soap))
		return soap_closesock(soap);
	if (!&out)
		return soap_closesock(soap);
	out.soap_default(soap);
	if (soap_begin_recv(soap)
	 || soap_envelope_begin_in(soap)
	 || soap_recv_header(soap)
	 || soap_body_begin_in(soap))
		return soap_closesock(soap);
	out.soap_get(soap, "ns:messgResponse", "");
	if (soap->error)
		return soap_recv_fault(soap, 0);
	if (soap_body_end_in(soap)
	 || soap_envelope_end_in(soap)
	 || soap_end_recv(soap))
		return soap_closesock(soap);
	return soap_closesock(soap);
}

SOAP_FMAC5 int SOAP_FMAC6 soap_call_ns__test2(struct soap *soap, const char *soap_endpoint, const char *soap_action, std::vector<int >_param_3, char **_param_4)
{	struct ns__test2 soap_tmp_ns__test2;
	struct ns__test2Response *soap_tmp_ns__test2Response;
	if (soap_endpoint == NULL)
		soap_endpoint = "http://localhost:8080/messgserver";
	soap_begin(soap);
	soap->encodingStyle = NULL;
	soap_tmp_ns__test2._param_3 = _param_3;
	soap_serializeheader(soap);
	soap_serialize_ns__test2(soap, &soap_tmp_ns__test2);
	if (soap_begin_count(soap))
		return soap->error;
	if (soap->mode & SOAP_IO_LENGTH)
	{	if (soap_envelope_begin_out(soap)
		 || soap_putheader(soap)
		 || soap_body_begin_out(soap)
		 || soap_put_ns__test2(soap, &soap_tmp_ns__test2, "ns:test2", NULL)
		 || soap_body_end_out(soap)
		 || soap_envelope_end_out(soap))
			 return soap->error;
	}
	if (soap_end_count(soap))
		return soap->error;
	if (soap_connect(soap, soap_url(soap, soap_endpoint, NULL), soap_action)
	 || soap_envelope_begin_out(soap)
	 || soap_putheader(soap)
	 || soap_body_begin_out(soap)
	 || soap_put_ns__test2(soap, &soap_tmp_ns__test2, "ns:test2", NULL)
	 || soap_body_end_out(soap)
	 || soap_envelope_end_out(soap)
	 || soap_end_send(soap))
		return soap_closesock(soap);
	if (!_param_4)
		return soap_closesock(soap);
	*_param_4 = NULL;
	if (soap_begin_recv(soap)
	 || soap_envelope_begin_in(soap)
	 || soap_recv_header(soap)
	 || soap_body_begin_in(soap))
		return soap_closesock(soap);
	soap_tmp_ns__test2Response = soap_get_ns__test2Response(soap, NULL, "ns:test2Response", "");
	if (!soap_tmp_ns__test2Response || soap->error)
		return soap_recv_fault(soap, 0);
	if (soap_body_end_in(soap)
	 || soap_envelope_end_in(soap)
	 || soap_end_recv(soap))
		return soap_closesock(soap);
	if (_param_4 && soap_tmp_ns__test2Response->_param_4)
		*_param_4 = *soap_tmp_ns__test2Response->_param_4;
	return soap_closesock(soap);
}

#if defined(__BORLANDC__)
#pragma option pop
#pragma option pop
#endif

/* End of messgClient.cpp */