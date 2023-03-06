YUI.add("dom-style",function(e,t){var n="documentElement",r="defaultView",i="ownerDocument",s="style",o="float",u="cssFloat",a="styleFloat",f="transparent",l="getComputedStyle",c="getBoundingClientRect",h=e.config.doc,p=e.DOM,d,v,m=["WebkitTransform","MozTransform","OTransform","msTransform","transform"],g=/width|height|top|left|right|bottom|margin|padding/i;e.Array.each(m,function(e){e in h[n].style&&(d=e,v=e+"Origin")}),e.mix(p,{DEFAULT_UNIT:"px",CUSTOM_STYLES:{},setStyle:function(e,t,n,r){r=r||e.style;var i=p.CUSTOM_STYLES;if(r){n===null||n===""?n="":!isNaN(Number(n))&&g.test(t)&&(n+=p.DEFAULT_UNIT);if(t in i){if(i[t].set){i[t].set(e,n,r);return}typeof i[t]=="string"&&(t=i[t])}else t===""&&(t="cssText",n="");r[t]=n}},getStyle:function(e,t,n){n=n||e.style;var r=p.CUSTOM_STYLES,i="";if(n){if(t in r){if(r[t].get)return r[t].get(e,t,n);typeof r[t]=="string"&&(t=r[t])}i=n[t],i===""&&(i=p[l](e,t))}return i},setStyles:function(t,n){var r=t.style;e.each(n,function(e,n){p.setStyle(t,n,e,r)},p)},getComputedStyle:function(e,t){var n="",o=e[i],u;return e[s]&&o[r]&&o[r][l]&&(u=o[r][l](e,null),u&&(n=u[t])),n}}),h[n][s][u]!==undefined?p.CUSTOM_STYLES[o]=u:h[n][s][a]!==undefined&&(p.CUSTOM_STYLES[o]=a),e.UA.webkit&&(p[l]=function(e,t){var n=e[i][r],s=n[l](e,"")[t];return s==="rgba(0, 0, 0, 0)"&&(s=f),s}),e.DOM._getAttrOffset=function(t,n){var r=e.DOM[l](t,n),i=t.offsetParent,s,o,u;return r==="auto"&&(s=e.DOM.getStyle(t,"position"),s==="static"||s==="relative"?r=0:i&&i[c]&&(o=i[c]()[n],u=t[c]()[n],n==="left"||n==="top"?r=u-o:r=o-t[c]()[n])),r},e.DOM._getOffset=function(e,t){var n,r=null,i={left:"offsetLeft",right:"offsetRight"},s={left:"marginLeft",right:"marginRight"},o;return t=t||"left",e&&(n=p.getStyle(e,"position"),o=parseInt(p[l](e,s[t]),10),r=[parseInt(p[l](e,t),10),parseInt(p[l](e,"top"),10)],isNaN(r[0])&&(r[0]=parseInt(p.getStyle(e,t),10),isNaN(r[0])&&(r[0]=n==="relative"?0:e[i[t]]-o||0)),isNaN(r[1])&&(r[1]=parseInt(p.getStyle(e,"top"),10),isNaN(r[1])&&(r[1]=n==="relative"?0:e.offsetTop||0))),r},d&&(p.CUSTOM_STYLES.transform={set:function(e,t,n){n[d]=t},get:function(e){return p[l](e,d)}},p.CUSTOM_STYLES.transformOrigin={set:function(e,t,n){n[v]=t},get:function(e){return p[l](e,v)}})},"patched-v3.17.0",{requires:["dom-base"]});
