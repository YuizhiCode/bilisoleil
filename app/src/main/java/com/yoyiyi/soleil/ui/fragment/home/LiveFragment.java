package com.yoyiyi.soleil.ui.fragment.home;

import com.yoyiyi.soleil.R;
import com.yoyiyi.soleil.base.BaseRefreshFragment;

/**
 * @author zzq  作者 E-mail:   soleilyoyiyi@gmail.com
 * @date 创建时间：2017/5/23 14:23
 * 描述:推荐
 */

public class LiveFragment extends BaseRefreshFragment {

    public static LiveFragment newInstance() {
        return new LiveFragment();
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_recommend;
    }
}
