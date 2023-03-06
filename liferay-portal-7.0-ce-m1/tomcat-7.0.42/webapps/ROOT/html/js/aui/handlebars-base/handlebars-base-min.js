YUI.add("handlebars-base",function(e,t){
/*!
Handlebars.js - Copyright (C) 2011 Yehuda Katz
https://raw.github.com/wycats/handlebars.js/master/LICENSE
*/
;var n=e.namespace("Handlebars");n.VERSION="1.0.0",n.COMPILER_REVISION=4,n.REVISION_CHANGES={1:"<= 1.0.rc.2",2:"== 1.0.0-rc.3",3:"== 1.0.0-rc.4",4:">= 1.0.0"},n.helpers={},n.partials={};var r=Object.prototype.toString,i="[object Function]",s="[object Object]";n.registerHelper=function(e,t,i){if(r.call(e)===s){if(i||t)throw new n.Exception("Arg not supported with multiple helpers");n.Utils.extend(this.helpers,e)}else i&&(t.not=i),this.helpers[e]=t},n.registerPartial=function(e,t){r.call(e)===s?n.Utils.extend(this.partials,e):this.partials[e]=t},n.registerHelper("helperMissing",function(e){if(arguments.length===2)return undefined;throw new Error("Missing helper: '"+e+"'")}),n.registerHelper("blockHelperMissing",function(e,t){var s=t.inverse||function(){},o=t.fn,u=r.call(e);return u===i&&(e=e.call(this)),e===!0?o(this):e===!1||e==null?s(this):u==="[object Array]"?e.length>0?n.helpers.each(e,t):s(this):o(e)}),n.K=function(){},n.createFrame=Object.create||function(e){n.K.prototype=e;var t=new n.K;return n.K.prototype=null,t},n.logger={DEBUG:0,INFO:1,WARN:2,ERROR:3,level:3,methodMap:{0:"debug",1:"info",2:"warn",3:"error"},log:function(e,t){if(n.logger.level<=e){var r=n.logger.methodMap[e];typeof console!="undefined"&&console[r]&&console[r].call(console,t)}}},n.log=function(e,t){n.logger.log(e,t)},n.registerHelper("each",function(e,t){var s=t.fn,o=t.inverse,u=0,a="",f,l=r.call(e);l===i&&(e=e.call(this)),t.data&&(f=n.createFrame(t.data));if(e&&typeof e=="object")if(e instanceof Array)for(var c=e.length;u<c;u++)f&&(f.index=u),a+=s(e[u],{data:f});else for(var h in e)e.hasOwnProperty(h)&&(f&&(f.key=h),a+=s(e[h],{data:f}),u++);return u===0&&(a=o(this)),a}),n.registerHelper("if",function(e,t){var s=r.call(e);return s===i&&(e=e.call(this)),!e||n.Utils.isEmpty(e)?t.inverse(this):t.fn(this)}),n.registerHelper("unless",function(e,t){return n.helpers["if"].call(this,e,{fn:t.inverse,inverse:t.fn})}),n.registerHelper("with",function(e,t){var s=r.call(e);s===i&&(e=e.call(this));if(!n.Utils.isEmpty(e))return t.fn(e)}),n.registerHelper("log",function(e,t){var r=t.data&&t.data.level!=null?parseInt(t.data.level,10):1;n.log(r,e)});var o=["description","fileName","lineNumber","message","name","number","stack"];n.Exception=function(e){var t=Error.prototype.constructor.apply(this,arguments);for(var n=0;n<o.length;n++)this[o[n]]=t[o[n]]},n.Exception.prototype=new Error,n.SafeString=function(e){this.string=e},n.SafeString.prototype.toString=function(){return this.string.toString()};var u={"&":"&amp;","<":"&lt;",">":"&gt;",'"':"&quot;","'":"&#x27;","`":"&#x60;"},a=/[&<>"'`]/g,f=/[&<>"'`]/,l=function(e){return u[e]||"&amp;"};n.Utils={extend:function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])},escapeExpression:function(e){return e instanceof n.SafeString?e.toString():e==null||e===!1?"":(e=e.toString(),f.test(e)?e.replace(a,l):e)},isEmpty:function(e){return!e&&e!==0?!0:r.call(e)==="[object Array]"&&e.length===0?!0:!1}},n.VM={template:function(e){var t={escapeExpression:n.Utils.escapeExpression,invokePartial:n.VM.invokePartial,programs:[],program:function(e,t,r){var i=this.programs[e];return r?i=n.VM.program(e,t,r):i||(i=this.programs[e]=n.VM.program(e,t)),i},merge:function(e,t){var r=e||t;return e&&t&&(r={},n.Utils.extend(r,t),n.Utils.extend(r,e)),r},programWithDepth:n.VM.programWithDepth,noop:n.VM.noop,compilerInfo:null};return function(r,i){i=i||{};var s=e.call(t,n,r,i.helpers,i.partials,i.data),o=t.compilerInfo||[],u=o[0]||1,a=n.COMPILER_REVISION;if(u!==a){if(u<a){var f=n.REVISION_CHANGES[a],l=n.REVISION_CHANGES[u];throw"Template was precompiled with an older version of Handlebars than the current runtime. Please update your precompiler to a newer version ("+f+") or downgrade your runtime to an older version ("+l+")."}throw"Template was precompiled with a newer version of Handlebars than the current runtime. Please update your runtime to a newer version ("+o[1]+")."}return s}},programWithDepth:function(e,t,n){var r=Array.prototype.slice.call(arguments,3),i=function(e,i){return i=i||{},t.apply(this,[e,i.data||n].concat(r))};return i.program=e,i.depth=r.length,i},program:function(e,t,n){var r=function(e,r){return r=r||{},t(e,r.data||n)};return r.program=e,r.depth=0,r},noop:function(){return""},invokePartial:function(e,t,r,i,s,o){var u={helpers:i,partials:s,data:o};if(e===undefined)throw new n.Exception("The partial "+t+" could not be found");if(e instanceof Function)return e(r,u);if(!n.compile)throw new n.Exception("The partial "+t+" could not be compiled when running in runtime-only mode");return s[t]=n.compile(e,{data:o!==undefined}),s[t](r,u)}},n.template=n.VM.template,n.VERSION+="-yui",n.revive=n.template,e.namespace("Template").Handlebars=n},"patched-v3.17.0",{requires:[]});