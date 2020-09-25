package org.erusu.codewars.kyu_4;
/*
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
*/
import java.util.*;
import java.util.stream.*;
import java.util.Map.*;

/*

[[o, x, y], [h, r, u], [b, x, z], [r, y, z], [v, y, z], [v, w, y], [o, s, y], [i, u, z], [q, y, z], [k, p, v], [w, x, z], [k, x, y], [r, w, x], [a, n, w], [b, d, t], [p, u, y], [n, v, z], [f, k, q], [i, m, z], [a, w, y], [b, k, n], [t, u, w], [x, y, z], [f, g, j], [n, y, z], [s, y, z], [k, w, x], [m, s, u], [h, i, s], [q, w, z], [w, y, z], [j, o, p], [r, v, y], [h, p, w], [s, t, z], [j, k, r], [n, u, w], [h, v, w], [t, u, y], [l, q, y], [v, w, x], [r, w, z], [m, o, w], [k, q, x], [e, h, r], [e, k, l], [d, h, p], [r, u, w], [e, g, n], [m, o, y], [q, r, s], [d, i, q], [u, w, z], [u, w, x], [u, x, z], [e, l, x], [p, t, v], [k, t, w], [v, x, y], [f, y, z], [v, w, z], [d, f, h], [h, t, x], [c, w, x], [v, x, z], [f, p, x], [g, x, y], [g, v, w], [f, l, s], [c, f, v], [g, q, s], [d, t, y], [j, p, t], [d, k, s], [s, w, x], [d, q, x], [o, r, s], [l, v, y], [r, t, y], [i, y, z], [g, r, w], [g, h, l], [c, x, z], [g, t, v], [f, g, n], [l, r, t], [r, u, x], [u, x, y], [s, x, y], [b, u, z], [l, w, y], [a, n, v], [k, l, z], [n, q, w], [m, u, z], [k, u, y], [t, v, z], [o, w, z], [c, h, y], [h, s, y], [l, r, z], [a, s, z], [f, r, v], [d, q, v], [u, v, y], [t, x, y], [b, w, y], [j, q, u], [o, t, y], [p, y, z], [l, y, z], [n, s, u], [m, s, x], [b, s, y], [l, s, z], [d, m, u], [i, o, w], [c, v, w], [t, y, z], [l, n, y], [m, x, y], [n, v, x], [n, u, z], [g, h, s], [r, v, w], [j, u, x], [m, v, z], [d, r, z], [o, v, x], [f, n, q], [a, b, t], [h, v, x], [e, u, x], [o, w, y], [d, i, m], [a, f, w], [f, n, r], [d, m, x], [p, r, z], [p, u, v], [e, y, z], [c, o, x], [c, x, y], [a, i, w], [q, x, y], [c, i, n], [u, v, z], [u, w, y], [f, r, x], [t, w, z], [e, r, v], [o, q, t], [m, w, x], [g, v, x], [c, j, k], [i, s, y], [g, s, u], [i, j, s], [d, m, n], [l, n, v], [e, s, w], [o, u, w], [b, s, z], [a, d, g], [l, w, x], [m, r, x], [j, k, l], [f, p, s], [p, r, v], [g, x, z], [o, u, z], [h, k, s], [i, r, w], [n, q, y], [o, q, r], [f, q, y], [e, j, z], [e, o, u], [j, k, z], [b, g, t], [f, v, w], [w, x, y], [t, v, w], [a, p, w], [c, l, x], [q, s, y], [k, n, q], [d, y, z], [i, p, v], [e, k, y], [e, w, z], [i, m, v], [j, s, v], [l, o, u], [e, o, q], [a, i, s], [e, m, y], [b, y, z], [c, k, u], [a, k, p], [p, x, y], [h, p, q], [p, t, w], [e, x, z], [l, p, y], [m, y, z], [l, t, v], [d, g, n], [h, o, t], [c, t, x], [a, o, v], [m, v, x], [k, o, q], [i, v, y], [b, m, s], [h, q, w], [f, h, x], [i, v, z], [f, t, w], [l, v, z], [f, g, w], [s, w, z], [j, k, o], [d, j, m], [r, t, u], [k, m, z], [q, w, y], [q, u, v], [g, s, x], [p, s, t], [i, m, t], [c, g, y], [n, w, z], [o, r, z], [h, i, m], [n, t, w], [s, u, y], [s, x, z], [h, x, z], [e, f, x], [a, k, n], [h, s, z], [j, o, w], [o, t, x], [l, n, r], [m, x, z], [r, x, y], [b, w, z], [c, j, q], [b, f, o], [o, x, z], [i, j, r], [p, q, y], [j, p, s], [m, r, w], [a, e, y], [u, y, z], [j, l, u], [j, s, y], [k, x, z], [p, v, y], [j, l, p], [p, v, z], [f, h, t], [k, n, x], [f, n, o], [p, v, w], [k, v, y], [j, w, y], [e, n, s], [f, j, p], [f, u, w], [g, m, z], [n, s, y], [m, s, z], [c, d, x], [l, x, y], [g, y, z], [b, t, w], [n, q, z], [r, w, y], [r, t, w], [l, t, x], [m, w, y], [h, m, t], [k, n, v], [a, j, y], [f, q, w], [s, u, w], [p, t, z], [j, l, r], [m, n, w], [n, t, v], [n, p, r], [l, u, w], [g, j, o], [b, j, v], [m, o, t], [k, w, z], [f, i, n], [i, u, y], [p, v, x], [k, l, u], [b, c, f], [f, q, v], [c, h, u], [i, n, w], [q, s, t], [k, q, w], [o, q, s], [o, r, v], [m, t, u], [n, u, y], [c, s, z], [o, q, x], [r, t, z], [a, g, q], [g, s, z], [i, w, y], [j, l, y], [e, v, x], [e, n, t], [f, g, v], [a, j, n], [d, h, r], [a, p, u], [l, s, v], [l, q, z], [k, y, z], [r, s, y], [n, x, y], [o, u, x], [n, q, t], [c, f, h], [q, s, x], [a, l, p], [l, s, u], [e, r, y], [k, v, x], [j, o, s], [o, p, q], [m, v, w], [o, q, v], [a, w, z], [l, u, x], [g, s, v], [p, q, v], [b, o, s], [o, s, v], [f, h, y], [k, s, w], [h, t, u], [t, v, x], [q, v, w], [j, p, v], [c, l, u], [m, s, w], [e, j, p], [e, f, h], [a, s, t], [i, k, t], [j, l, m], [d, e, x], [j, x, y], [a, k, v], [j, q, v], [s, v, y], [d, k, q], [g, o, s], [a, u, y], [h, u, x], [e, q, s], [a, f, v], [i, r, x], [o, y, z], [h, v, z], [i, u, v], [h, p, x], [i, t, z], [f, o, q], [a, x, y], [t, w, x], [c, u, w], [b, g, u], [q, v, y], [r, x, z], [s, u, x], [s, v, z], [e, h, l], [e, w, y], [j, s, x], [q, w, x], [q, x, z], [f, l, n], [d, n, y], [j, r, u], [u, v, w], [t, x, z], [m, o, z], [f, m, q], [k, l, y], [f, s, x], [m, w, z], [g, w, x], [m, u, y], [n, q, u], [l, t, w], [r, u, z], [o, s, w], [d, s, y], [u, v, x], [h, y, z], [g, m, u], [a, c, l], [d, e, k], [p, q, s], [g, j, l], [c, e, g], [b, l, v], [o, q, z], [p, q, u], [m, u, w], [j, n, y], [c, q, v], [p, u, w], [i, o, y], [f, m, x], [j, t, x], [h, m, x], [c, s, x], [i, q, v], [s, v, w], [i, w, x], [m, p, t], [o, v, y], [p, t, u], [e, w, x], [n, r, s], [e, l, z], [s, u, z], [g, m, t], [h, u, v], [r, t, x], [l, s, x], [o, p, v], [n, v, w], [p, s, u], [e, s, u], [j, y, z], [f, n, u], [h, s, v], [f, m, n], [i, q, x], [d, j, l], [k, t, v], [o, p, w], [e, k, m], [j, n, v], [h, j, p], [p, x, z], [c, g, t], [i, n, r], [h, o, p], [c, h, v], [l, p, z], [q, v, z], [e, t, w], [b, t, x], [d, v, x], [l, r, u], [f, k, y], [f, x, y], [h, m, n], [s, v, x]]


{{'o', 'x', 'y'}, {'h', 'r', 'u'}, {'b', 'x', 'z'}, {'r', 'y', 'z'}, {'v', 'y', 'z'}, {'v', 'w', 'y'}, {'o', 's', 'y'}, {'i', 'u', 'z'}, {'q', 'y', 'z'}, {'k', 'p', 'v'}, {'w', 'x', 'z'}, {'k', 'x', 'y'}, {'r', 'w', 'x'}, {'a', 'n', 'w'}, {'b', 'd', 't'}, {'p', 'u', 'y'}, {'n', 'v', 'z'}, {'f', 'k', 'q'}, {'i', 'm', 'z'}, {'a', 'w', 'y'}, {'b', 'k', 'n'}, {'t', 'u', 'w'}, {'x', 'y', 'z'}, {'f', 'g', 'j'}, {'n', 'y', 'z'}, {'s', 'y', 'z'}, {'k', 'w', 'x'}, {'m', 's', 'u'}, {'h', 'i', 's'}, {'q', 'w', 'z'}, {'w', 'y', 'z'}, {'j', 'o', 'p'}, {'r', 'v', 'y'}, {'h', 'p', 'w'}, {'s', 't', 'z'}, {'j', 'k', 'r'}, {'n', 'u', 'w'}, {'h', 'v', 'w'}, {'t', 'u', 'y'}, {'l', 'q', 'y'}, {'v', 'w', 'x'}, {'r', 'w', 'z'}, {'m', 'o', 'w'}, {'k', 'q', 'x'}, {'e', 'h', 'r'}, {'e', 'k', 'l'}, {'d', 'h', 'p'}, {'r', 'u', 'w'}, {'e', 'g', 'n'}, {'m', 'o', 'y'}, {'q', 'r', 's'}, {'d', 'i', 'q'}, {'u', 'w', 'z'}, {'u', 'w', 'x'}, {'u', 'x', 'z'}, {'e', 'l', 'x'}, {'p', 't', 'v'}, {'k', 't', 'w'}, {'v', 'x', 'y'}, {'f', 'y', 'z'}, {'v', 'w', 'z'}, {'d', 'f', 'h'}, {'h', 't', 'x'}, {'c', 'w', 'x'}, {'v', 'x', 'z'}, {'f', 'p', 'x'}, {'g', 'x', 'y'}, {'g', 'v', 'w'}, {'f', 'l', 's'}, {'c', 'f', 'v'}, {'g', 'q', 's'}, {'d', 't', 'y'}, {'j', 'p', 't'}, {'d', 'k', 's'}, {'s', 'w', 'x'}, {'d', 'q', 'x'}, {'o', 'r', 's'}, {'l', 'v', 'y'}, {'r', 't', 'y'}, {'i', 'y', 'z'}, {'g', 'r', 'w'}, {'g', 'h', 'l'}, {'c', 'x', 'z'}, {'g', 't', 'v'}, {'f', 'g', 'n'}, {'l', 'r', 't'}, {'r', 'u', 'x'}, {'u', 'x', 'y'}, {'s', 'x', 'y'}, {'b', 'u', 'z'}, {'l', 'w', 'y'}, {'a', 'n', 'v'}, {'k', 'l', 'z'}, {'n', 'q', 'w'}, {'m', 'u', 'z'}, {'k', 'u', 'y'}, {'t', 'v', 'z'}, {'o', 'w', 'z'}, {'c', 'h', 'y'}, {'h', 's', 'y'}, {'l', 'r', 'z'}, {'a', 's', 'z'}, {'f', 'r', 'v'}, {'d', 'q', 'v'}, {'u', 'v', 'y'}, {'t', 'x', 'y'}, {'b', 'w', 'y'}, {'j', 'q', 'u'}, {'o', 't', 'y'}, {'p', 'y', 'z'}, {'l', 'y', 'z'}, {'n', 's', 'u'}, {'m', 's', 'x'}, {'b', 's', 'y'}, {'l', 's', 'z'}, {'d', 'm', 'u'}, {'i', 'o', 'w'}, {'c', 'v', 'w'}, {'t', 'y', 'z'}, {'l', 'n', 'y'}, {'m', 'x', 'y'}, {'n', 'v', 'x'}, {'n', 'u', 'z'}, {'g', 'h', 's'}, {'r', 'v', 'w'}, {'j', 'u', 'x'}, {'m', 'v', 'z'}, {'d', 'r', 'z'}, {'o', 'v', 'x'}, {'f', 'n', 'q'}, {'a', 'b', 't'}, {'h', 'v', 'x'}, {'e', 'u', 'x'}, {'o', 'w', 'y'}, {'d', 'i', 'm'}, {'a', 'f', 'w'}, {'f', 'n', 'r'}, {'d', 'm', 'x'}, {'p', 'r', 'z'}, {'p', 'u', 'v'}, {'e', 'y', 'z'}, {'c', 'o', 'x'}, {'c', 'x', 'y'}, {'a', 'i', 'w'}, {'q', 'x', 'y'}, {'c', 'i', 'n'}, {'u', 'v', 'z'}, {'u', 'w', 'y'}, {'f', 'r', 'x'}, {'t', 'w', 'z'}, {'e', 'r', 'v'}, {'o', 'q', 't'}, {'m', 'w', 'x'}, {'g', 'v', 'x'}, {'c', 'j', 'k'}, {'i', 's', 'y'}, {'g', 's', 'u'}, {'i', 'j', 's'}, {'d', 'm', 'n'}, {'l', 'n', 'v'}, {'e', 's', 'w'}, {'o', 'u', 'w'}, {'b', 's', 'z'}, {'a', 'd', 'g'}, {'l', 'w', 'x'}, {'m', 'r', 'x'}, {'j', 'k', 'l'}, {'f', 'p', 's'}, {'p', 'r', 'v'}, {'g', 'x', 'z'}, {'o', 'u', 'z'}, {'h', 'k', 's'}, {'i', 'r', 'w'}, {'n', 'q', 'y'}, {'o', 'q', 'r'}, {'f', 'q', 'y'}, {'e', 'j', 'z'}, {'e', 'o', 'u'}, {'j', 'k', 'z'}, {'b', 'g', 't'}, {'f', 'v', 'w'}, {'w', 'x', 'y'}, {'t', 'v', 'w'}, {'a', 'p', 'w'}, {'c', 'l', 'x'}, {'q', 's', 'y'}, {'k', 'n', 'q'}, {'d', 'y', 'z'}, {'i', 'p', 'v'}, {'e', 'k', 'y'}, {'e', 'w', 'z'}, {'i', 'm', 'v'}, {'j', 's', 'v'}, {'l', 'o', 'u'}, {'e', 'o', 'q'}, {'a', 'i', 's'}, {'e', 'm', 'y'}, {'b', 'y', 'z'}, {'c', 'k', 'u'}, {'a', 'k', 'p'}, {'p', 'x', 'y'}, {'h', 'p', 'q'}, {'p', 't', 'w'}, {'e', 'x', 'z'}, {'l', 'p', 'y'}, {'m', 'y', 'z'}, {'l', 't', 'v'}, {'d', 'g', 'n'}, {'h', 'o', 't'}, {'c', 't', 'x'}, {'a', 'o', 'v'}, {'m', 'v', 'x'}, {'k', 'o', 'q'}, {'i', 'v', 'y'}, {'b', 'm', 's'}, {'h', 'q', 'w'}, {'f', 'h', 'x'}, {'i', 'v', 'z'}, {'f', 't', 'w'}, {'l', 'v', 'z'}, {'f', 'g', 'w'}, {'s', 'w', 'z'}, {'j', 'k', 'o'}, {'d', 'j', 'm'}, {'r', 't', 'u'}, {'k', 'm', 'z'}, {'q', 'w', 'y'}, {'q', 'u', 'v'}, {'g', 's', 'x'}, {'p', 's', 't'}, {'i', 'm', 't'}, {'c', 'g', 'y'}, {'n', 'w', 'z'}, {'o', 'r', 'z'}, {'h', 'i', 'm'}, {'n', 't', 'w'}, {'s', 'u', 'y'}, {'s', 'x', 'z'}, {'h', 'x', 'z'}, {'e', 'f', 'x'}, {'a', 'k', 'n'}, {'h', 's', 'z'}, {'j', 'o', 'w'}, {'o', 't', 'x'}, {'l', 'n', 'r'}, {'m', 'x', 'z'}, {'r', 'x', 'y'}, {'b', 'w', 'z'}, {'c', 'j', 'q'}, {'b', 'f', 'o'}, {'o', 'x', 'z'}, {'i', 'j', 'r'}, {'p', 'q', 'y'}, {'j', 'p', 's'}, {'m', 'r', 'w'}, {'a', 'e', 'y'}, {'u', 'y', 'z'}, {'j', 'l', 'u'}, {'j', 's', 'y'}, {'k', 'x', 'z'}, {'p', 'v', 'y'}, {'j', 'l', 'p'}, {'p', 'v', 'z'}, {'f', 'h', 't'}, {'k', 'n', 'x'}, {'f', 'n', 'o'}, {'p', 'v', 'w'}, {'k', 'v', 'y'}, {'j', 'w', 'y'}, {'e', 'n', 's'}, {'f', 'j', 'p'}, {'f', 'u', 'w'}, {'g', 'm', 'z'}, {'n', 's', 'y'}, {'m', 's', 'z'}, {'c', 'd', 'x'}, {'l', 'x', 'y'}, {'g', 'y', 'z'}, {'b', 't', 'w'}, {'n', 'q', 'z'}, {'r', 'w', 'y'}, {'r', 't', 'w'}, {'l', 't', 'x'}, {'m', 'w', 'y'}, {'h', 'm', 't'}, {'k', 'n', 'v'}, {'a', 'j', 'y'}, {'f', 'q', 'w'}, {'s', 'u', 'w'}, {'p', 't', 'z'}, {'j', 'l', 'r'}, {'m', 'n', 'w'}, {'n', 't', 'v'}, {'n', 'p', 'r'}, {'l', 'u', 'w'}, {'g', 'j', 'o'}, {'b', 'j', 'v'}, {'m', 'o', 't'}, {'k', 'w', 'z'}, {'f', 'i', 'n'}, {'i', 'u', 'y'}, {'p', 'v', 'x'}, {'k', 'l', 'u'}, {'b', 'c', 'f'}, {'f', 'q', 'v'}, {'c', 'h', 'u'}, {'i', 'n', 'w'}, {'q', 's', 't'}, {'k', 'q', 'w'}, {'o', 'q', 's'}, {'o', 'r', 'v'}, {'m', 't', 'u'}, {'n', 'u', 'y'}, {'c', 's', 'z'}, {'o', 'q', 'x'}, {'r', 't', 'z'}, {'a', 'g', 'q'}, {'g', 's', 'z'}, {'i', 'w', 'y'}, {'j', 'l', 'y'}, {'e', 'v', 'x'}, {'e', 'n', 't'}, {'f', 'g', 'v'}, {'a', 'j', 'n'}, {'d', 'h', 'r'}, {'a', 'p', 'u'}, {'l', 's', 'v'}, {'l', 'q', 'z'}, {'k', 'y', 'z'}, {'r', 's', 'y'}, {'n', 'x', 'y'}, {'o', 'u', 'x'}, {'n', 'q', 't'}, {'c', 'f', 'h'}, {'q', 's', 'x'}, {'a', 'l', 'p'}, {'l', 's', 'u'}, {'e', 'r', 'y'}, {'k', 'v', 'x'}, {'j', 'o', 's'}, {'o', 'p', 'q'}, {'m', 'v', 'w'}, {'o', 'q', 'v'}, {'a', 'w', 'z'}, {'l', 'u', 'x'}, {'g', 's', 'v'}, {'p', 'q', 'v'}, {'b', 'o', 's'}, {'o', 's', 'v'}, {'f', 'h', 'y'}, {'k', 's', 'w'}, {'h', 't', 'u'}, {'t', 'v', 'x'}, {'q', 'v', 'w'}, {'j', 'p', 'v'}, {'c', 'l', 'u'}, {'m', 's', 'w'}, {'e', 'j', 'p'}, {'e', 'f', 'h'}, {'a', 's', 't'}, {'i', 'k', 't'}, {'j', 'l', 'm'}, {'d', 'e', 'x'}, {'j', 'x', 'y'}, {'a', 'k', 'v'}, {'j', 'q', 'v'}, {'s', 'v', 'y'}, {'d', 'k', 'q'}, {'g', 'o', 's'}, {'a', 'u', 'y'}, {'h', 'u', 'x'}, {'e', 'q', 's'}, {'a', 'f', 'v'}, {'i', 'r', 'x'}, {'o', 'y', 'z'}, {'h', 'v', 'z'}, {'i', 'u', 'v'}, {'h', 'p', 'x'}, {'i', 't', 'z'}, {'f', 'o', 'q'}, {'a', 'x', 'y'}, {'t', 'w', 'x'}, {'c', 'u', 'w'}, {'b', 'g', 'u'}, {'q', 'v', 'y'}, {'r', 'x', 'z'}, {'s', 'u', 'x'}, {'s', 'v', 'z'}, {'e', 'h', 'l'}, {'e', 'w', 'y'}, {'j', 's', 'x'}, {'q', 'w', 'x'}, {'q', 'x', 'z'}, {'f', 'l', 'n'}, {'d', 'n', 'y'}, {'j', 'r', 'u'}, {'u', 'v', 'w'}, {'t', 'x', 'z'}, {'m', 'o', 'z'}, {'f', 'm', 'q'}, {'k', 'l', 'y'}, {'f', 's', 'x'}, {'m', 'w', 'z'}, {'g', 'w', 'x'}, {'m', 'u', 'y'}, {'n', 'q', 'u'}, {'l', 't', 'w'}, {'r', 'u', 'z'}, {'o', 's', 'w'}, {'d', 's', 'y'}, {'u', 'v', 'x'}, {'h', 'y', 'z'}, {'g', 'm', 'u'}, {'a', 'c', 'l'}, {'d', 'e', 'k'}, {'p', 'q', 's'}, {'g', 'j', 'l'}, {'c', 'e', 'g'}, {'b', 'l', 'v'}, {'o', 'q', 'z'}, {'p', 'q', 'u'}, {'m', 'u', 'w'}, {'j', 'n', 'y'}, {'c', 'q', 'v'}, {'p', 'u', 'w'}, {'i', 'o', 'y'}, {'f', 'm', 'x'}, {'j', 't', 'x'}, {'h', 'm', 'x'}, {'c', 's', 'x'}, {'i', 'q', 'v'}, {'s', 'v', 'w'}, {'i', 'w', 'x'}, {'m', 'p', 't'}, {'o', 'v', 'y'}, {'p', 't', 'u'}, {'e', 'w', 'x'}, {'n', 'r', 's'}, {'e', 'l', 'z'}, {'s', 'u', 'z'}, {'g', 'm', 't'}, {'h', 'u', 'v'}, {'r', 't', 'x'}, {'l', 's', 'x'}, {'o', 'p', 'v'}, {'n', 'v', 'w'}, {'p', 's', 'u'}, {'e', 's', 'u'}, {'j', 'y', 'z'}, {'f', 'n', 'u'}, {'h', 's', 'v'}, {'f', 'm', 'n'}, {'i', 'q', 'x'}, {'d', 'j', 'l'}, {'k', 't', 'v'}, {'o', 'p', 'w'}, {'e', 'k', 'm'}, {'j', 'n', 'v'}, {'h', 'j', 'p'}, {'p', 'x', 'z'}, {'c', 'g', 't'}, {'i', 'n', 'r'}, {'h', 'o', 'p'}, {'c', 'h', 'v'}, {'l', 'p', 'z'}, {'q', 'v', 'z'}, {'e', 't', 'w'}, {'b', 't', 'x'}, {'d', 'v', 'x'}, {'l', 'r', 'u'}, {'f', 'k', 'y'}, {'f', 'x', 'y'}, {'h', 'm', 'n'}, {'s', 'v', 'x'}}
 */

public class Triplets {

    public static String recoverSecret(char[][] triplets) {
        char currentChar;
        String secret = "";
        List<List<Character>> mutableTriplets = new ArrayList<>();

        // convert array of arrays to list of lists to delete them as we go
        for(char[] triplet : triplets) {
            mutableTriplets.add(new String(triplet)
                    .chars()
                    .mapToObj(ch -> (char)ch)
                    .collect(Collectors.toList()));
        }

        // calculate first character, and delete it from each list
        while (mutableTriplets.size() > 0){
            currentChar = detFirstChar(mutableTriplets);
            secret += currentChar;
            for(List<Character> triplet : mutableTriplets) {
                triplet.remove(new Character(currentChar));
            }
            while(mutableTriplets.contains(new ArrayList<Character>(0))) {
                mutableTriplets.remove(new ArrayList<Character>(0));
            }
        }

        return secret;
    }

    public static char detFirstChar(List<List<Character>> charSeqs) {
        Map<Character, Integer> firstCharMap = new HashMap<>();
        Iterator<Entry<Character, Integer>> firstCharIterator;
        Entry<Character, Integer> nextEntry;

        // map first chars
        for(List<Character> trp : charSeqs) {
            firstCharMap.put(trp.get(0), 0);
        }

        // find last index in each array where first character appears
        for(List<Character> trp : charSeqs) {
            for(int index = 0; index < trp.size(); index++) {
                if(firstCharMap.containsKey(trp.get(index)) && firstCharMap.get(trp.get(index)) < index)
                    firstCharMap.put(trp.get(index), index);
            }
        }

        firstCharIterator = firstCharMap.entrySet().iterator();

        // determine first character
        while(firstCharIterator.hasNext()) {
            nextEntry = firstCharIterator.next();
            if(nextEntry.getValue() == 0)
                return nextEntry.getKey();
        }

        return 0;
    }
    /*
    // Very Slow
    public static String recoverSecret(char[][] triplets) {
        char firstChar = detFirstChar(triplets),
            lastChar = detLastChar(triplets),
            currentChar = firstChar;

        String secret = firstChar + "";

        while(currentChar != lastChar) {
            currentChar = detNextChar(currentChar, triplets).get(0);
            secret += currentChar;
        }

        return secret;
    }

    public static char detFirstChar(char[][] charSeqs) {
        Map<Character, Integer> firstCharMap = new HashMap<>();
        Iterator<Entry<Character, Integer>> firstCharIterator;
        Entry<Character, Integer> nextEntry;

        // map first chars
        for(char[] arr : charSeqs) {
            firstCharMap.put(arr[0], 0);
        }

        // find last index in each array where first character appears
        for(char[] arr : charSeqs) {
            for(int index = 0; index < arr.length; index++) {
                if(firstCharMap.containsKey(arr[index]) && firstCharMap.get(arr[index]) < index)
                    firstCharMap.put(arr[index], index);
            }
        }

        firstCharIterator = firstCharMap.entrySet().iterator();

        // determine first character
        while(firstCharIterator.hasNext()) {
            nextEntry = firstCharIterator.next();
            if(nextEntry.getValue() == 0)
                return nextEntry.getKey();
        }

        return 0;
    }

    public static char detLastChar(char[][] charSeqs) {
        Map<Character, Integer> lastCharLocMap = new HashMap<>();
        Iterator<Entry<Character, Integer>> lastCharLocIterator;
        Entry<Character, Integer> nextEntry;

        // map chars and last location of them
        for(char[] arr : charSeqs) {
            for(int index = 0; index < arr.length; index++) {
                lastCharLocMap.putIfAbsent(arr[index], 2);
                if(lastCharLocMap.get(arr[index]) > index)
                    lastCharLocMap.put(arr[index], index);
            }
        }

        lastCharLocIterator = lastCharLocMap.entrySet().iterator();

        // determine last character
        while(lastCharLocIterator.hasNext()) {
            nextEntry = lastCharLocIterator.next();
            if(nextEntry.getValue() == 2)
                return nextEntry.getKey();
        }

        return 0;
    }

    public static List<Character> detNextChar(char currentChar, char[][] charSeqs) {
        List<Character> nextChars = new ArrayList<>(),
            charsToTest = new ArrayList<>();

        // map chars that come after char that is being looked for
        for(char[] ch : charSeqs) {
            for(int index = 0; index < ch.length - 1; index++) {
                if(ch[index] == currentChar) {
                    nextChars.add(ch[index + 1]);
                }
            }
        }

        nextChars = nextChars.stream().distinct().collect(Collectors.toList());

        // determine the next character
        if(nextChars.size() > 1) {
            int indexOfNextChar = 0;

            while(nextChars.size() > 1) {
                charsToTest.addAll(detNextChar(nextChars.get(indexOfNextChar), charSeqs));

                for(int index = 0; index < charsToTest.size(); index++) {
                    if(nextChars.contains(charsToTest.get(index))) {
                        indexOfNextChar--;
                        nextChars.remove(charsToTest.get(index));
                    } else {
                        charsToTest.addAll(detNextChar(charsToTest.get(index), charSeqs));
                    }
                }
                charsToTest.clear();
                indexOfNextChar++;
            }
        }
        return nextChars;
    }
     */
}