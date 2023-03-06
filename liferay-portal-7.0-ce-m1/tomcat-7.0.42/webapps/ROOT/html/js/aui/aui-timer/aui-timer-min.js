YUI.add("aui-timer",function(e,t){var n=e.Lang,r=n.now,i=e.Object.isEmpty,s=e.Array,o={clearInterval:function(e){var t=o;t.unregister(!0,e)},clearTimeout:function(e){var t=o;t.unregister(!1,e)},intervalTime:function(e){var t=o;return arguments.length&&(t._INTERVAL=e),t._INTERVAL},isRepeatable:function(e){return e.repeats},setTimeout:function(e,t,n){var r=o,i=s(arguments,3,!0);return r.register(!1,e,t,n,i)},setInterval:function(e,t,n){var r=o,i=s(arguments,3,!0);return r.register(!0,e,t,n,i)},register:function(t,n,r,i,s){var u=o,a=++e.Env._uidx;return s=s||[],s.unshift(n,i),u._TASKS[a]=u._create(t,u._getNearestInterval(r),e.rbind.apply(e,s)),u._lazyInit(),a},run:function(e){return e.lastRunTime=r(),e.fn()},unregister:function(e,t){var n=o,r=n._TASKS,i=r[t];return n._lazyDestroy(),i&&i.repeats===e&&delete r[t]},_create:function(e,t,n){return{fn:n,lastRunTime:r(),next:t,repeats:e,timeout:t}},_decrementNextRunTime:function(e){return e.next=e.timeout-(r()-e.lastRunTime)},_getNearestInterval:function(e){var t=o,n=t._INTERVAL,r=e%n,i;return r<n/2?i=e-r:i=e+n-r,i},_lazyDestroy:function(){var e=o;e._initialized&&i(e._TASKS)&&(clearTimeout(e._globalIntervalId),e._initialized=!1)},_lazyInit:function(){var e=o;!e._initialized&&!i(e._TASKS)&&(e._lastRunTime=r(),e._globalIntervalId=setTimeout(e._runner,e._INTERVAL),e._initialized=!0)},_loop:function(e,t,n){var i=o,s=i._INTERVAL,u=i._TASKS,a=s/2;for(var f=r();e<n&&r()-f<50;e++){var l=t[e],c=u[l];c&&i._decrementNextRunTime(c)<a&&(i.run(c),i.isRepeatable(c)?i._resetNextRunTime(c):i.unregister(!1,l))}i._initialized&&(e<n?i._globalIntervalId=setTimeout(i._loop,10):i._globalIntervalId=setTimeout(i._runner,s))},_runner:function(){var t=o,n=0,r=e.Object.keys(t._TASKS),i=r.length;t._loop(n,r,i)},_resetNextRunTime:function(e){return e.next=e.timeout},_INTERVAL:50,_TASKS:{},_lastRunTime:0,_globalIntervalId:0,_initialized:!1};e.clearInterval=o.clearInterval,e.clearTimeout=o.clearTimeout,e.setInterval=o.setInterval,e.setTimeout=o.setTimeout,e.Timer=o},"3.0.0pr2",{requires:["oop"]});
