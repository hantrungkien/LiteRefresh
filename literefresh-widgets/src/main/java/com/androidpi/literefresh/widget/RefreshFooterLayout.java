/*
 * Copyright 2018 yinpinjiu@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.androidpi.literefresh.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.androidpi.literefresh.behavior.RefreshFooterBehavior;

/**
 */
public class RefreshFooterLayout extends FrameLayout implements CoordinatorLayout.AttachedBehavior{

    protected RefreshFooterBehavior behavior;

    public RefreshFooterLayout(Context context) {
        this(context, null);
    }

    public RefreshFooterLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RefreshFooterLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        behavior = new RefreshFooterBehavior(context, attrs);
    }

    @NonNull
    @Override
    public CoordinatorLayout.Behavior getBehavior() {
        return behavior;
    }
}
