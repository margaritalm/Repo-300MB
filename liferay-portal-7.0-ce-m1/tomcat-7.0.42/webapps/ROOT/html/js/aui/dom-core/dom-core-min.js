YUI.add("dom-core",function(e,t){var n="nodeType",r="ownerDocument",i="documentElement",s="defaultView",o="parentWindow",u="tagName",a="parentNode",f="previousSibling",l="nextSibling",c="contains",h="compareDocumentPosition",p=[],d=function(){var t=e.config.doc.createElement("div"),n=t.appendChild(e.config.doc.createTextNode("")),r=!1;try{r=t.contains(n)}catch(i){}return r}(),v={byId:function(e,t){return v.allById(e,t)[0]||null},getId:function(e){var t;return e.id&&!e.id.tagName&&!e.id.item?t=e.id:e.attributes&&e.attributes.id&&(t=e.attributes.id.value),t},setId:function(e,t){e.setAttribute?e.setAttribute("id",t):e.id=t},ancestor:function(e,t,n,r){var i=null;return n&&(i=!t||t(e)?e:null),i||v.elementByAxis(e,a,t,null,r)},ancestors:function(e,t,n,r){var i=e,s=[];while(i=v.ancestor(i,t,n,r)){n=!1;if(i){s.unshift(i);if(r&&r(i))return s}}return s},elementByAxis:function(e,t,n,r,i){while(e&&(e=e[t])){if((r||e[u])&&(!n||n(e)))return e;if(i&&i(e))return null}return null},contains:function(e,t){var r=!1;if(!t||!e||!t[n]||!e[n])r=!1;else if(e[c]&&(t[n]===1||d))r=e[c](t);else if(e[h]){if(e===t||!!(e[h](t)&16))r=!0}else r=v._bruteContains(e,t);return r},inDoc:function(e,t){var n=!1,s;return e&&e.nodeType&&(t||(t=e[r]),s=t[i],s&&s.contains&&e.tagName?n=s.contains(e):n=v.contains(s,e)),n},allById:function(t,n){n=n||e.config.doc;var r=[],i=[],s,o;if(n.querySelectorAll)i=n.querySelectorAll('[id="'+t+'"]');else if(n.all){r=n.all(t);if(r){r.nodeName&&(r.id===t?(i.push(r),r=p):r=[r]);if(r.length)for(s=0;o=r[s++];)(o.id===t||o.attributes&&o.attributes.id&&o.attributes.id.value===t)&&i.push(o)}}else i=[v._getDoc(n).getElementById(t)];return i},isWindow:function(e){return!!(e&&e.scrollTo&&e.document)},_removeChildNodes:function(e){while(e.firstChild)e.removeChild(e.firstChild)},siblings:function(e,t){var n=[],r=e;while(r=r[f])r[u]&&(!t||t(r))&&n.unshift(r);r=e;while(r=r[l])r[u]&&(!t||t(r))&&n.push(r);return n},_bruteContains:function(e,t){while(t){if(e===t)return!0;t=t.parentNode}return!1},_getRegExp:function(e,t){return t=t||"",v._regexCache=v._regexCache||{},v._regexCache[e+t]||(v._regexCache[e+t]=new RegExp(e,t)),v._regexCache[e+t]},_getDoc:function(t){var i=e.config.doc;return t&&(i=t[n]===9?t:t[r]||t.document||e.config.doc),i},_getWin:function(t){var n=v._getDoc(t);return n[s]||n[o]||e.config.win},_batch:function(e,t,n,r,i,s){t=typeof t=="string"?v[t]:t;var o,u=0,a,f;if(t&&e)while(a=e[u++])o=o=t.call(v,a,n,r,i,s),typeof o!="undefined"&&(f||(f=[]),f.push(o));return typeof f!="undefined"?f:e},generateID:function(t){var n=t.id;return n||(n=e.stamp(t),t.id=n),n}};e.DOM=v},"patched-v3.17.0",{requires:["oop","features"]});
