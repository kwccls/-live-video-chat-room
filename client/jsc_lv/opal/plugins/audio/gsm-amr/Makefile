#
# Makefile for GSM-AMR Codec Plugin
#
# Copyright (C) 2004 MX Telecom Ltd.
#
# $Revision: 21044 $
# $Author: ms30002000 $
# $Date: 2008-09-17 19:43:43 +0000 (Wed, 17 Sep 2008) $

AC_PLUGIN_DIR=@AC_PLUGIN_DIR@
prefix=@prefix@
exec_prefix=@exec_prefix@
libdir=@libdir@
target_os=@target_os@

OBJDIR	= ./obj
SRCDIR  = ./src
PLUGINDIR=../..

BASENAME= gsmamrcodec
SONAME	= $(BASENAME)

CC	 	=@CC@
CFLAGS	 	=@CFLAGS@
CXX	 	=@CXX@
LDSO	 	=@LDSO@
PLUGINEXT	=@PLUGINEXT@
STDCCFLAGS	=@STDCCFLAGS@
LDFLAGS		=@LDFLAGS@

SRCS	= amrcodec.c \
	interf_enc.c \
	interf_dec.c \
	sp_dec.c \
	sp_enc.c

vpath	%.o $(OBJDIR)
vpath	%.c $(SRCDIR)

CFLAGS += -I../../../include -I$(SRCDIR)
CFLAGS += -DIF2
EXTRACFLAGS=-I$(PLUGINDIR)

PLUGIN	= ./$(BASENAME)_pwplugin.$(PLUGINEXT)

$(OBJDIR)/%.o : %.c
	@mkdir -p $(OBJDIR) >/dev/null 2>&1
	$(CC) -c -I../../../include $(STDCCFLAGS) $(CFLAGS) $(EXTRACFLAGS) -o $@ $<

OBJECTS	= $(addprefix $(OBJDIR)/,$(patsubst %.c,%.o,$(notdir $(SRCS))))


$(PLUGIN): $(OBJECTS)

ifeq (solaris,$(findstring solaris,$(target_os)))

	$(CC) $(LDSO) $@ -o $@ $^
else	
	$(CC) $(LDSO) -o $@ $^

endif	

install:
	mkdir -p $(DESTDIR)$(libdir)/$(AC_PLUGIN_DIR)
	install $(PLUGIN) $(DESTDIR)$(libdir)/$(AC_PLUGIN_DIR)

uninstall:
	rm -f $(DESTDIR)$(libdir)/$(AC_PLUGIN_DIR)/$(PLUGIN)

clean:
	rm -f $(OBJECTS) $(PLUGIN)

###########################################

