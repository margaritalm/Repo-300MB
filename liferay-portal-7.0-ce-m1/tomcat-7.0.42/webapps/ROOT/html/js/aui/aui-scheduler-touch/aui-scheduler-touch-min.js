YUI.add("aui-scheduler-touch",function(e,t){function a(){}var n=e.getClassName("scheduler-event"),r=e.getClassName("scheduler-event","all","day"),i=e.getClassName("scheduler-view","day","resizer"),s=e.getClassName("scheduler-view","day","table","col"),o=e.getClassName("scheduler-view","day","table","colday"),u=e.getClassName("scheduler","touch");a.prototype={initializer:function(){this._schedulerTouchEventHandles=[e.after(this._afterBindUI,this,"bindUI"),e.after(this._afterSyncUI,this,"syncUI")]},destructor:function(){(new e.EventHandle(this._schedulerTouchEventHandles)).detach()},_afterBindUI:function(){this._schedulerTouchEventHandles.push(e.on(this._onPrepareEventCreation,this,"_prepareEventCreation"),e.after(this._afterPlotEvents,this,"plotEvents"),this.columnData.delegate("click",e.bind(this._onClickTableCol,this),"."+s))},_afterSyncUI:function(){var e=this.get("scheduler");e.controlsNode.get("parentNode").prepend(e.viewDateNode),e.get("boundingBox").addClass(u)},_bindMouseEvents:function(){this._schedulerTouchEventHandles.push(this.columnData.delegate("gesturemovestart",e.bind(this._onGestureMoveStartTableCol,this),"."+s),this.columnData.delegate("gesturemove",e.bind(this._onGestureMoveTableCol,this),"."+o),this.columnData.delegate("gesturemoveend",e.bind(this._onGestureMoveEndTableCol,this),"."+s))},_afterPlotEvents:function(){var e=this;this.get("boundingBox").all("."+n).each(function(){!this.hasClass(r)&&!this.one("."+i)&&e.get("resizerNode").cloneNode(!0).appendTo(this)})},_findActiveColumn:function(e){var t=this.get("boundingBox").all("."+o),n;for(var r=0;r<t.size();r++){n=t.item(r);if(n.get("region").left<=e.pageX&&e.pageX<=n.get("region").right)return n}},_onClickTableCol:function(e){var t=this.get("scheduler").get("eventRecorder");this._prepareEventCreation(e,60),this.plotEvent(t),t.showPopover(),this.creationStartDate=null,this.startXY=null},_onGestureMoveEndTableCol:function(){this.resizing=!1,this.get("boundingBox").selectable()},_onGestureMoveStartTableCol:function(e){this._onMouseDownTableCol(e)},_onGestureMoveTableCol:function(e){this._onMouseMoveTableCol(e)},_onPrepareEventCreation:function(t){if(t.type==="gesturemovestart")return new e.Do.Prevent}},a.ATTRS={eventWidth:{value:100,validator:e.Lang.isNumber}},e.Base.mix(e.SchedulerDayView,[a])},"3.0.0pr2",{requires:["base-build","event-gestures","aui-scheduler"],skinnable:!0});
