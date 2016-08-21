/*
 * Copyright (c) 2016 Adventech <info@adventech.io>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.cryart.sabbathschool.viewmodel;

import android.content.Context;
import android.view.View;

import com.cryart.sabbathschool.view.SSLoginActivity;

public class SSLoginViewModel implements SSViewModel {
    private static final String TAG = SSLoginViewModel.class.getSimpleName();
    private Context context;

    public SSLoginViewModel(Context context) {
        this.context = context;
    }

    public void onClickSignIn(View view){
        ((SSLoginActivity) context).initGoogleLogin();
    }

    public void onClickSignInFB(View view){
        ((SSLoginActivity) context).initFacebookLogin();
    }

    public void onClickSignInAnonymous(View view){
        ((SSLoginActivity) context).initAnonymousLogin();
    }

    @Override
    public void destroy() {
        this.context = null;
    }
}
